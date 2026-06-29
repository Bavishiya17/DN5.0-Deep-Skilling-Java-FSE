# Exercise 4: Handling Void Methods

## Scenario
Test a void method that performs some action without returning a value.

## Steps
1. Create a mock object.
2. Stub the void method using doNothing().
3. Verify the interaction.

## Concepts
- doNothing().when(mock).voidMethod() - stub void methods
- doThrow().when(mock).voidMethod() - make void method throw
