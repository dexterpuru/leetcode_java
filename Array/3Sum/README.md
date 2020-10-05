Leetcode Link:
https://leetcode.com/problems/3sum/

Problem Statement
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []

Approach
For finding 'a' of (a,b,c), we will first traverse the array with a for loop, then use the Two-pointer technique for finding the 'b' and 'c'. A normal Brute force solution will take time complexity of O(n-cube) , but we will optimize it to O(n-square). We will also Hashset to maintain unique answers.

**Time Complexity: O(N*N), where N is the size of the input array

**Space Complexity: O(N)




