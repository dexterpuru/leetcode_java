#### Leetcode Link: 
https://leetcode.com/problems/minimum-path-sum/

### Problem Statement
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right 
which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Example:
Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
Explanation: Because the path 1→3→1→1→1 minimizes the sum.

###  Approach
Solved this problem using recursion with memoization technique.
Start at top left of the grid.
If the current location matches with the destination, return the value at the current location. 
If destination is not yet reached, check the cache if we already calculated the min path sum to reach the destination 
from current location. If found in cache, return the result.
Otherwise, do the following
1. calculate the path sum to reach the destination by traversing right.
2. calculate the path sum to reach the destination by traversing down.
3. pick the min value of both.
4. Add min value found with the value at the current location.
5. Store it in cache and return the result.
     
**Time Complexity: O(M*N), M is the number of rows, N is the number of cols.

**Space Complexity: O(M*N), M is the number of rows, N is the number of cols.

