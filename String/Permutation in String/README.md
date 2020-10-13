#### Leetcode Link: 

> https://leetcode.com/problems/permutation-in-string/

### Problem Statement

> Given two strings **s1** and **s2**, write a function to return true if **s2** contains the permutation of **s1**. In other words, one of the first string's permutations is the **substring** of the second string.
>
>  
>
> **Example 1:**
>
> ```
> Input: s1 = "ab" s2 = "eidbaooo"
> Output: True
> Explanation: s2 contains one permutation of s1 ("ba").
> ```
>
> **Example 2:**
>
> ```
> Input:s1= "ab" s2 = "eidboaoo"
> Output: False
> ```
>
>  
>
> **Constraints:**
>
> - The input strings only contain lower case letters.
> - The length of both given strings is in range [1, 10,000].



## Solution Approach

>  	 Sliding window approach.
>      -> Get character frequency map of s1.
>      -> Add characters of s2 to a window of size s1.length().
>      -> During addition of characters, take note of the 
>          number of unique characters of s2 that match with those of s1.
>      -> If number of unique characters of the current window matches 
>          with the size of the character frequency map, return true.
>      -> Else, slide the window, while adding/removing characters and 
>          maintaining the numOfCharsMatched count.
>          While doing so, if the numOfCharsMatched == charFreqMap.size() 
>          at any point, then return true.
>      -> If we exit the loop without encountering the return statement, 
>          return false.



**Time Complexity: O(N) **, N being the length of s2.

**Space Complexity: O(M)**, M being the length of s1; Due to the character frequency hash-map.