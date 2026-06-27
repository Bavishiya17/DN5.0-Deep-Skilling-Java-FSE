import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ExceptionThrower {

    public void throwException() {
        throw new IllegalArgumentException("Exception Thrown");
    }
}

public class ExceptionThrowerTest {

    @Test
    void testException() {
        ExceptionThrower obj = new ExceptionThrower();

        assertThrows(IllegalArgumentException.class, () -> {
            obj.throwException();
        });
    }
}