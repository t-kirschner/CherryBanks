package backend

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


internal class SavingsAccountTest {
    private val a1 = SavingsAccount(50.0)
    private val c1 = Customer("Max", "Mustermann")

    @Test
    fun deposit() {
        a1.deposit(50.0)
        assertEquals(100.0, a1.getBalance())
    }

    @Test
    fun withdraw() {
        a1.withdraw(40.0)
        assertEquals(10.0, a1.getBalance())
    }

    @Test
    fun create() {
        val a2 = SavingsAccount.create(30.0)
        c1.addAccount(a2)
        assertEquals(a2, c1.getAccount(a2.getId()))
    }
}