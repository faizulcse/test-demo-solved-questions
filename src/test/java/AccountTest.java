import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void test1() {
        Account account = new Account(-100);
        assertFalse(account.deposit(-10));
        assertFalse(account.withdraw(-10));
    }

    @Test
    public void test2() {
        Account account = new Account(-20);
        account.withdraw(10);
        assertEquals(account.getOverdraftLimit(), account.getBalance(), epsilon);
    }

    @Test
    public void test3() {
        Account account = new Account(-100);
        account.deposit(10);
        assertEquals(10.d, account.getBalance(), epsilon);
        account.withdraw(10);
        assertEquals(0.d, account.getBalance(), epsilon);
    }

    @Test
    public void test4() {
        Account account = new Account(-100);
        assertTrue(account.deposit(10));
        assertTrue(account.withdraw(10));
    }
}