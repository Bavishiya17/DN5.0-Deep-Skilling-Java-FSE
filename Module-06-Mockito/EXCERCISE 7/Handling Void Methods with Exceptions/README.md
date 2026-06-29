# Exercise 7: Handling Void Methods with Exceptions

## Scenario
Test a void method that throws an exception under certain conditions.

## Steps
1. Create a mock object.
2. Stub the void method to throw an exception using doThrow().
3. Verify the exception is thrown and the interaction occurred.

## Concepts
- doThrow(new Exception()).when(mock).voidMethod() - stub void to throw
- ssertThrows() - JUnit 5 exception assertion
