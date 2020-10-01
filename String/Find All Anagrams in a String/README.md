#### Leetcode Link: 

> https://leetcode.com/problems/find-all-anagrams-in-a-string/

### Problem Statement

> Given a string **s** and a **non-empty** string **p**, find all the start indices of **p**'s anagrams in **s**.
>
> Strings consists of lowercase English letters only and the length of both strings **s** and **p** will not be larger than 20,100.
>
> The order of output does not matter.
>
> **Example 1:**
>
> ```
> Input:
> s: "cbaebabacd" p: "abc"
> 
> Output:
> [0, 6]
> 
> Explanation:
> The substring with start index = 0 is "cba", which is an anagram of "abc".
> The substring with start index = 6 is "bac", which is an anagram of "abc".
> ```
>
> 
>
> **Example 2:**
>
> ```
> Input:
> s: "abab" p: "ab"
> 
> Output:
> [0, 1, 2]
> 
> Explanation:
> The substring with start index = 0 is "ab", which is an anagram of "ab".
> The substring with start index = 1 is "ba", which is an anagram of "ab".
> The substring with start index = 2 is "ab", which is an anagram of "ab".
> ```

### Sliding Window Approach

* We can convert the pattern string to a HashMap of the occurrence frequencies of each letter in the pattern.

* This will reduce this problem to one of finding a substring that has the same letter occurrence frequency as the pattern. This avoids the need for substring comparisons with pattern string.

* Start iterating through the String; adding characters to the Sliding Window.

* If the character added is seen in the HashMap, decrease its HashMap frequency by one. If this leads to frequency being zero, then we have matched the frequency for this letter.

* If the total of such matching letters equals the HashMap size, that means we have matched the Pattern with the substring in the current Sliding Window. Add that Window's start index to the result.

* If the Window size >= pattern length, reduce window size on the left. IF the character removed is part of the pattern, increase frequency in HashMap by 1.

  **Time Complexity: O(N + M)**, where N is length of input String and M is length of input Pattern.

  **Space Complexity: O(N + M)**, since M characters may need to be stored in the HashMap and N possible value in the result.