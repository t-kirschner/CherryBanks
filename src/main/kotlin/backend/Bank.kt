package backend

class Bank {
    private val customers: MutableList<Customer> = mutableListOf()

    fun addCustomer(customer: Customer) {
        customers.add(customer)
    }

    fun deleteCustomer(customer: Customer) {
        customers.remove(customer)
    }

    fun isEmpty(): Boolean {
        return customers.isEmpty()
    }

    fun getCustomer(customerId: Int): Customer? {
        return customers.find { it.getId() == customerId }
    }
}