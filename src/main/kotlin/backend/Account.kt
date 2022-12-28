package backend

abstract class Account(protected var balance: Double) : Printable {
    protected var accountId: Int = 0

    init {
        accountId = idCounter
        idCounter++
    }

    companion object {
        private var idCounter = 1
    }

    abstract fun deposit(amount: Double)
    abstract fun withdraw(amount: Double)

    fun getId(): Int {
        return this.accountId
    }

    @JvmName("getBalance1")
    fun getBalance(): Double {
        return this.balance
    }
}