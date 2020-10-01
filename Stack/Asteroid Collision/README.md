#### Leetcode Link: 

 https://leetcode.com/problems/asteroid-collision/
### Problem Statement

We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.


```
Example 1:
Input: 
asteroids = [5, 10, -5]
Output: [5, 10]
Explanation: 
The 10 and -5 collide resulting in 10.  The 5 and 10 never collide.

Example 2:
Input: 
asteroids = [8, -8]
Output: []
Explanation: 
The 8 and -8 collide exploding each other.
```
###  Approach

*  A row of asteroids is stable if no further collisions will occur. 
*  After adding a new asteroid to the right, some more collisions may happen before it becomes stable again, and all of those collisions (if they happen) must occur right to left. 
*  This is the perfect situation for using a stack.
*  Say we have our answer as a stack with rightmost asteroid top, and a new asteroid comes in. 
*  If new is moving right (new > 0), or if top is moving left (top < 0), no collision occurs.


  **Time Complexity: O(N)**, where N is the number of asteroids.

  **Space Complexity: O(N)**, the size of the output array
