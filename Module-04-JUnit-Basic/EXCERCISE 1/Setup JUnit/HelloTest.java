import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void testMessage() {
        String message = "Hello JUnit";
        assertEquals("Hello JUnit", message);
    }
}