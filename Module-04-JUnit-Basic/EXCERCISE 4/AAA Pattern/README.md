# Exercise 4: Arrange-Act-Assert (AAA) Pattern

## Aim

To organize test cases using the Arrange-Act-Assert (AAA) pattern.

## Program 1: Calculator.java

```java
public class Calculator {

    public int multiply(int a, int b) {
        return a * b;
    }
}
```

## Program 2: CalculatorAAATest.java

```java
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
```

## Expected Output

Tests run: 1

Failures: 0

BUILD SUCCESS

## Result

Thus, the Arrange-Act-Assert (AAA) pattern was implemented successfully using JUnit.
