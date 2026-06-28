import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EvenChecker {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

public class EvenCheckerTest {

    EvenChecker checker = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = { 2, 4, 6, 8, 10 })
    void testEvenNumbers(int number) {
        assertTrue(checker.isEven(number));
    }
}