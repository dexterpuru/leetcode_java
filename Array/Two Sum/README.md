#### Leetcode Link: 

> https://leetcode.com/problems/two-sum/

### Problem Statement

> Given an array of integers `nums` and an integer `target`, return *indices of the two numbers such that they add up to `target`*.
>
> You may assume that each input would have ***exactly\* one solution**, and you may not use the *same* element twice.
>
> You can return the answer in any order.
>
>  
>
> **Example 1:**
>
> ```
> Input: nums = [2,7,11,15], target = 9
> Output: [0,1]
> Output: Because nums[0] + nums[1] == 9, we return [0, 1].
> ```
>
> **Example 2:**
>
> ```
> Input: nums = [3,2,4], target = 6
> Output: [1,2]
> ```
>
> **Example 3:**
>
> ```
> Input: nums = [3,3], target = 6
> Output: [0,1]
> ```
>
>  
>
> **Constraints:**
>
> - 2 <= nums.length <= 10<sup>5</sup>
> - -10<sup>9</sup> <= nums[i] <= 10<sup>9</sup>
> - -10<sup>9</sup> <= target <= 10<sup>9</sup>
> - **Only one valid answer exists.**

#### Approach: One-pass Hash Table

It turns out we can do it in one-pass. While we iterate and inserting elements into the table, we also look back to check if current  element's complement already exists in the table. If it exists, we have  found a solution and return immediately.

##### Pseudo-code [Considering we always have a solution]

```
twoSum(nums[], target) {

	map = new Hashmap
	
	for (i = 0..nums.length) {
	
		complement = target - nums[i]
		
		if (map.containsKey(complement)) {
		
			return {map.get(complement), i}
		}
		
		map.put(nums[i], i)
	}
}
```

**Complexity Analysis:**

- **Time complexity : O(n)**. We traverse the list containing n elements only once. Each look up in the table costs only **O(1)** time.
- **Space complexity : O(n)**. The extra space required depends on the number of items stored in the hash table, which stores at most n elements.