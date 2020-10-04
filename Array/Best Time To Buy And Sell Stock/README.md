#### Leetcode Link: 

https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

### Problem Statement

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.

###  Approach
As per the given condition, we need to buy the stock first before selling it. 
So, set the initial cost price as the value of the first element in the array.
Then iterate through all the elements starting from index 1. 
If the current price is less than the cost price, then update the cost price to current value.
Otherwise, calculate new profit and adjust the result if new profit is greater than current profit.
At the end of iteration, return the max profit.

**Time Complexity: O(N), where N is the size of the input array

**Space Complexity: O(1)
