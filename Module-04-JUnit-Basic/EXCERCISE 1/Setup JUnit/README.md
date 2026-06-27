# Exercise 1: Setting Up JUnit

## Aim

To set up JUnit in a Java project and execute a simple test case.

## Software Required

* Java JDK 8 or above
* JUnit 4.13.2
* VS Code / Eclipse / IntelliJ IDEA

## Program

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void testMessage() {
        String message = "Hello JUnit";
        assertEquals("Hello JUnit", message);
    }
}
```

## Expected Output

```text
JUnit version 4.13.2
.
Time: 0.001

OK (1 test)
```

## Result

Thus, JUnit was successfully configured and a simple test case was executed successfully.
