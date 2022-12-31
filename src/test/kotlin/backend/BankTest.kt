package backend

import kotlin.test.Test
import kotlin.test.assertEquals

internal class BankTest {

    private val testBank: Bank = Bank()
    private val c1 = Customer.create("Max", "Mustermann")

    @Test
    fun testIsEmpty() {
        assertEquals(true, testBank.isEmpty())
    }

    @Test
    fun testAddCustomer() {
        assertEquals(true, testBank.isEmpty())
        testBank.addCustomer(c1)
        assertEquals(c1, testBank.getCustomer(c1.getId()))
    }

    @Test
    fun testDeleteCustomer() {
        testBank.addCustomer(c1)
        assertEquals(false, testBank.isEmpty())
        testBank.deleteCustomer(c1)
        assertEquals(true, testBank.isEmpty())
    }

    @Test
    fun testGetCustomer() {
        testBank.addCustomer(c1)
        assertEquals(c1, testBank.getCustomer(c1.getId()))
    }
}