# Exercise 6: Verifying Interaction Order

## Scenario
Ensure that methods are called in a specific order using Mockito InOrder.

## Steps
1. Create a mock object.
2. Call the methods in a specific order.
3. Verify the interaction order using InOrder.

## Concepts
- InOrder inOrder = inOrder(mock) - creates ordered verifier
- inOrder.verify(mock).method() - verifies call sequence
