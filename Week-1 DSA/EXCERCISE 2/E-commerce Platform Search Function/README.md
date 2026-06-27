# Exercise 2 - E-commerce Platform Search Function

## Big O Notation

Big O notation measures the efficiency of an algorithm as input size increases.

## Search Cases

- Best Case
  - Item found at first position.
- Average Case
  - Item found in the middle.
- Worst Case
  - Item found at last position or not found.

## Time Complexity

| Algorithm | Best | Average | Worst |
|-----------|------|----------|--------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

## Analysis

Linear search checks each element one by one.

Binary search repeatedly divides the sorted array into halves, making it much faster for large datasets.

Therefore, Binary Search is more suitable for an e-commerce platform because it provides faster search performance with O(log n) time complexity.