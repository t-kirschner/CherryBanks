package backend

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


internal class SavingsAccountTest {
    private val a1 = SavingsAccount(50.0)

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
}