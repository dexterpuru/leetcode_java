
Leetcode Link:
https://leetcode.com/problems/jump-game/

Problem Statement:

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

Example 3:
	Input: nums = [0,3,2,1]
	Output: false
	Explanation: the first value is only zero, we cannot even start jumping.


Approach:

In the problem we need to check whether it is possible to reach the last index or not, by jumping starting from the first index. 
The value nums[i] denote the maximum jump length you can undertake if you are at that location. If that value is positive (>0) ,it ensures that we cross that index and move forward.
Thus we should rather check for index which the value 0. Because if you are at location with the value 0, you cannot cross that. If we are able to ensure, that this location with 0 value is bypassable , then we  can cross the whole length.
For doing that, we will traverse the whole array till the second last element. If we encounter a 0, we will go backwards and check if its bypassable or not, ie if the value of the element just before is greater than equal to 2 than from that location we can jump over this 0 location. 
We will do for all the 0 values in the array, if any of them is not bypassable , then we cannot reach the last index.  

**Time Complexity: O(N*N), where N is the size of the input array

**Space Complexity: O(1)
