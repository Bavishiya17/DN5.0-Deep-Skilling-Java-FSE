# Exercise 7 - Financial Forecasting

## Recursion

Recursion is a technique where a method calls itself until a base condition is reached.

It simplifies problems that can be divided into smaller subproblems.

## Algorithm

1. Read present value, growth rate, and years.
2. If years = 0, return present value.
3. Otherwise multiply the amount by (1 + rate/100).
4. Call the same method for remaining years.
5. Display the future value.

## Time Complexity

O(n)

where n is the number of years.

## Optimization

The recursive solution makes one recursive call per year.

For larger problems, Dynamic Programming or an iterative approach can reduce recursion overhead and avoid excessive function calls.