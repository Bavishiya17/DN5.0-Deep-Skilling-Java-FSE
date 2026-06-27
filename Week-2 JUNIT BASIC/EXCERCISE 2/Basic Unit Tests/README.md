# Exercise 2: Writing Basic JUnit Tests

## Aim

To write and execute basic JUnit test cases for a Java class.

## Software Required

* Java JDK 8 or above
* JUnit 4.13.2
* VS Code / Eclipse / IntelliJ IDEA

## Program 1: Calculator.java

```java
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
```

## Program 2: CalculatorTest.java

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.subtract(5, 3));
    }
}
```

## Expected Output

Tests run: 2

Failures: 0

Result: SUCCESS

## Result

Thus, basic JUnit test cases were written and executed successfully.
