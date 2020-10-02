#### Leetcode Link: 

https://leetcode.com/problems/subarray-product-less-than-k/

### Problem Statement

Your are given an array of positive integers nums.

Count and print the number of (contiguous) subarrays where the product of all the elements in the subarray is less than k.

**Example 1:**
```
Input: nums = [10, 5, 2, 6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are: [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6].
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
```

**Note:**
```
0 < nums.length <= 50000.
0 < nums[i] < 1000.
0 <= k < 10^6
```

###  Approach

We can apply sliding window type of approach to solve this problem. Where we create a virtual window that contains the range of values that whose product are less then a given `k`. Every time when we slide the window to one-step to the right, we check and stabilize the table by shifting the left-side border (if necessary). Summary of range size in every step gives us expected result.

- initilize left and right borders of the window
- `product` initialized as 1 (thats what usually used for production aggregation)
- `productCount` initialized as a 0 (this is where we aggregate summary of possible variations)
- run the cycle for the whole array 
    - multiply the next coming value to the `product` aggregator
    - if the `product` aggregator is over the given `k` limit, then start subtracting left-most elements of the window (by shifting the left border to the right)
    - aggregate current is of the window

**Time Complexity: O(N)**, where N is the number of elements in the array.

**Space Complexity: O(1)**, only operational variables are used.
