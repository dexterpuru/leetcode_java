#### Leetcode Link: 

https://leetcode.com/problems/largest-number/

### Problem Statement

Given a list of non-negative integers nums, arrange them such that they form the largest number.

**Note**: The result may be very large, so you need to return a string instead of an integer.


**Example 1**:

```
Input: nums = [10,2]
Output: "210"
```
**Example 2**:
```
Input: nums = [3,30,34,5,9]
Output: "9534330"
```
**Example 3**:
```
Input: nums = [1]
Output: "1"
```
**Example 4**:
```
Input: nums = [10]
Output: "10"
 ```

**Constraints**:
```
1 <= nums.length <= 100
0 <= nums[i] <= 10^9
```

###  Approach

- First convert given array of integer values to array of string values
- Next sort the values by their alphanumeric values in a combination where:
    - `b + a` and `a + b` are compared
    - here `b + a` refers to b-string concatenated with a-string
    - `a` and `b` refers to string values in the array


**Time Complexity: O(N log(N))**, where N is the number of elements in the array.

**Space Complexity: O(1)**, only operational variables are used.
