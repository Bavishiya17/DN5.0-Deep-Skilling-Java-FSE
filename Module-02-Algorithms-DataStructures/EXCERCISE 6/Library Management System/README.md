# Exercise 6 - Library Management System

## Search Algorithms

### Linear Search
Checks each element one by one until the required book is found.

### Binary Search
Repeatedly divides the sorted array into two halves to find the required book.

## Time Complexity

| Algorithm | Best | Average | Worst |
|-----------|------|----------|--------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

## Analysis

Linear Search works on both sorted and unsorted data.

Binary Search requires the array to be sorted but provides much faster searching.

For small or unsorted datasets, Linear Search is suitable.

For large sorted datasets, Binary Search is the better choice.