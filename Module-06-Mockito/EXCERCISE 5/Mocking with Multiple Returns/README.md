# Exercise 5: Mocking and Stubbing with Multiple Returns

## Scenario
Test a service that depends on an external API that returns different values on consecutive calls.

## Steps
1. Create a mock object for the external API.
2. Stub the methods to return different values on consecutive calls.
3. Write a test case that uses the mock object.

## Concepts
- 	henReturn(val1, val2, val3) - returns different values on consecutive calls
- 	henReturn(...).thenThrow(...) - chain stubs
