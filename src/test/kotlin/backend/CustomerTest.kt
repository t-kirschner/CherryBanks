package backend

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CustomerTest {
    private val c1 = Customer("Max", "Mustermann")
    private val a1 = CheckingAccount(50.0)

    @Test
    fun addAccount() {
        assertEquals(true, c1.isEmpty())
        c1.addAccount(a1)
        assertEquals(false, c1.isEmpty())
    }

    @Test
    fun deleteAccount() {
        c1.addAccount(a1)
        assertEquals(false, c1.isEmpty())
        c1.deleteAccount(a1)
        assertEquals(true, c1.isEmpty())
    }

    @Test
    fun isEmpty() {
        assertEquals(true, c1.isEmpty())
    }

    @Test
    fun getAccount() {
        c1.addAccount(a1)
        assertEquals(a1, c1.getAccount(a1.getId()))
    }
}