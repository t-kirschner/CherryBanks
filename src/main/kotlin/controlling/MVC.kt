package controlling

import backend.*
import frontend.UI
import java.lang.IllegalArgumentException
import kotlin.system.exitProcess

class MVC(private val bank: Bank) {
    fun startBanking() {

        while (true) {

            when (UI.getBankMenuInput()) {
                1 -> {
                    val customer = Customer.create(UI.getFirstName(), UI.getLastName())
                    bank.addCustomer(customer)
                    customer.print()
                }
                2 -> {
                    val customer = getCustomer() ?: continue
                    customer.print()

                    when (UI.getCustomerActionInput()) {
                        1 -> {

                            when (UI.getAccountChoiceInput()) {
                                1 -> {
                                    val account = CheckingAccount.create(UI.getAmount())
                                    customer.addAccount(account)
                                    account.print()
                                }
                                2 -> {
                                    val account = SavingsAccount.create(UI.getAmount())
                                    customer.addAccount(account)
                                    account.print()
                                }
                                3 -> exitProcess(1)
                            }
                        }
                        2 -> {
                            val account = getAccount(customer) ?: continue
                            account.print()

                            when (UI.getAccountActionInput()) {
                                1 -> {
                                    account.deposit(UI.getAmount())
                                    account.print()
                                }
                                2 -> {
                                    while (true) {
                                        try {
                                            account.withdraw(UI.getAmount())
                                            account.print()
                                            break
                                        } catch (e: IllegalArgumentException) {
                                            UI.showIllegalAmount()
                                        }
                                    }
                                }
                                3 -> {
                                    customer.deleteAccount(account)
                                    UI.showDeleted()
                                }
                                4 -> exitProcess(1)
                            }
                        }
                        3 -> {
                            bank.deleteCustomer(customer)
                            UI.showDeleted()
                        }
                        4 -> exitProcess(1)
                    }
                }
                3 -> exitProcess(1)
            }
        }
    }

    private fun getCustomer(): Customer? {
        if (bank.isEmpty()) {
            UI.showNoElements()
            return null
        }
        var customer = bank.getCustomer(UI.getCustomerId())
        while (customer == null) {
            UI.showWrongInput()
            customer = bank.getCustomer(UI.getCustomerId())
        }
        return customer
    }

    private fun getAccount(customer: Customer): Account? {
        if (customer.isEmpty()) {
            UI.showNoElements()
            return null
        }
        var account = customer.getAccount(UI.getAccountId())
        while (account == null) {
            UI.showWrongInput()
            account = customer.getAccount(UI.getAccountId())
        }
        return account
    }
}