package backend

class CheckingAccount(balance: Double) : Account(balance) {

    override fun deposit(amount: Double) {
        balance += amount
    }

    override fun withdraw(amount: Double) {
        balance -= amount
    }

    override fun print() {
        println(this::class.simpleName + "[ID: $accountId]")       //hier ok? Oder gehört println in UI?
        println("Balance: $balance\n")
    }

    companion object {
        fun create(startBalance: Double): CheckingAccount {
            return CheckingAccount(startBalance)
        }
    }
}