#### LeetCode Url:

> https://leetcode.com/problems/longest-substring-without-repeating-characters/

### Problem Statement:

Given a string s, find the length of the longest substring without repeating characters.

**Example 1:**

> **Input:** s = "abcabcbb"
> **Output:** 3
> **Explanation:** The answer is "abc", with the length of 3.

**Example 2:**

> **Input:** s = "bbbbb"
> **Output:** 1
> **Explanation:** The answer is "b", with the length of 1.

**Example 3:**

> **Input:** s = "pwwkew"
> **Output:** 3
> **Explanation:** The answer is "wke", with the length of 3. Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

**Example 4:**

> **Input:** s = ""
> **Output:** 0

**Constraints:**

> 0 <= s.length <= 5 \* 10<sup>4</sup>
> s consists of English letters, digits, symbols and spaces.

### Solution:

**Intuition:**

> Check all the substring one by one to see if it has no duplicate character.

## Sliding Window Approach

**Algorithm:**

> By using HashSet as a sliding window, checking if a character in the current can be done in O(1).

> A sliding window is an abstract concept commonly used in array/string problems. A window is a range of elements in the array/string which usually defined by the start and end indices, i.e. [i, j) (left-closed, right-open). A sliding window is a window "slides" its two boundaries to the certain direction. For example, if we slide [i, j) to the right by 1 element, then it becomes [i+1, j+1) (left-closed, right-open).

> Back to our problem. We use HashSet to store the characters in current window [i, j) (j = i initially). Then we slide the index j to the right. If it is not in the HashSet, we slide j further. Doing so until s[j] is already in the HashSet. At this point, we found the maximum size of substrings without duplicate characters start with index i. If we do this for all i, we get our answer.

**Complexity Analysis:**

> **Time complexity:** O(2n) = O(n). In the worst case each character will be visited twice by i and j.

> **Space complexity:** O(min(m, n)). We need O(k) space for the sliding window, where k is the size of the Set. The size of the Set is upper bounded by the size of the string n and the size of the charset/alphabet m.
