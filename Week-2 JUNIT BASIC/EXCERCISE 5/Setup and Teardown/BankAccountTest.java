import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(1000);
        System.out.println("Setup Method Executed");
    }

    @Test
    public void testBalance() {
        assertEquals(1000, account.getBalance());
    }

    @After
    public void tearDown() {
        System.out.println("Teardown Method Executed");
    }
}
