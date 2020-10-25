#### Leetcode Link: 

 https://leetcode.com/problems/combination-sum-ii/

### Problem Statement

Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used **once** in the combination.

**Note**: The solution set must not contain duplicate combinations.


```
Example 1:
Input: 
candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]

Example 2:
Input: 
candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]

Constraints:

1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30 	
```


###  Approach

* The algorithm is based upon a recursive method which is able to test each combination of numbers stored into a sorted integer array.
* First of all, the algorithm stop to investigate if the current index is to high.
* The algorithm also step back if the current sum is above a target.
* If the current value can be used to reach the target, the solution is added to the result and the algorithm go back to test other solutions.
* If the solution is not reached, the algorithm go ahead to test a solution with and without the current number.

  **Time Complexity: O(N*N)**, where N is the number of candidate.

  **Space Complexity: O(2N)**, the size of the input
