package controlling

import backend.*

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


internal class MVCTest {
    private val bank = Bank()
    private val customer = Customer("Max", "Mustermann")


    @Test
    fun getCustomer() {
        assertEquals(true, bank.isEmpty())
        bank.addCustomer(customer)
        assertEquals(customer, bank.getCustomer(1))
    }

    @Test
    fun getAccount() {
        assertEquals(true, customer.isEmpty())
        val account = CheckingAccount(50.0)
        customer.addAccount(account)
        assertEquals(account, customer.getAccount(1))
    }
}