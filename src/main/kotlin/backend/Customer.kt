package backend

class Customer(private val firstName: String, private val lastName: String) : Printable {
    private val accounts: MutableList<Account> = mutableListOf()
    private var customerId: Int = 0

    init {
        customerId = idCounter
        idCounter++
    }

    companion object {
        private var idCounter: Int = 1

        fun create(firstName: String, lastName: String): Customer {
            return Customer(firstName, lastName)
        }
    }

    fun getId(): Int {
        return this.customerId
    }

    fun addAccount(account: Account) {
        accounts.add(account)
    }

    fun deleteAccount(account: Account) {
        accounts.remove(account)
    }

    fun isEmpty(): Boolean {
        return accounts.isEmpty()
    }

    fun getAccount(accountId: Int): Account? {
        return accounts.find { it.getId() == accountId }
    }

    override fun print() {
        println("Customer [ID: $customerId]:\n$firstName $lastName\n")
        accounts.forEach { it.print() }
    }
}