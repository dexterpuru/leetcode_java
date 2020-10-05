#### Leetcode Link:
https://leetcode.com/problems/power-of-two/

#### Problem Statement
Given an integer n, write a function to determine if it is a power of two.

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
Example 4:

Input: n = 4
Output: true
Example 5:

Input: n = 5
Output: false


Constraints:
-2^31 <= n <= 2^31 - 1

###  Approach:
Solved this problem using recursive approach.
If the input is negative number, then we can return false, since it is not possible to get negative number by doing power of 2.  
We know 2^31 = 2,147,483,648. So, the maximum iterations that is required is 31.
We start with exponent 0. If 2 to the power of the current exponent matches with n, then we return true.
If 2 to the power of the current exponent is greater than n, then n is not power of 2 and we return false.
Otherwise, we increment the exponent by 1 and recur again.

**Time Complexity: O(N)**, where N is the maximum iterations which is equal to 31. 

We can conclude time complexity as O(1), since N is not growing with the input.

**Space Complexity: O(N)**, (considering stack space)

We can conclude space complexity as O(1), since N is not growing with the input.