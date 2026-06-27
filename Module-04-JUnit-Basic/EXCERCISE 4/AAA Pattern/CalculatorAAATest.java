import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAAATest {

    @Test
    public void testMultiply() {

        // Arrange
        Calculator calc = new Calculator();

        // Act
        int result = calc.multiply(4, 5);

        // Assert
        assertEquals(20, result);
    }
}