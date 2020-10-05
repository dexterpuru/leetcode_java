Leetcode Link:
https://leetcode.com/problems/jump-game/

Problem Statement
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

Approach
All we need to confirm is whether positions with values 0 are bypassable or not . So we will check the values before 0 position , if all the values are confirm that we can bypass ie jump over that 0 position , then we are clear to reach the end.

**Time Complexity: O(N*N), where N is the size of the input array

**Space Complexity: O(1)




