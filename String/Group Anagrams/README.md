### Leetcode Link:
https://leetcode.com/problems/group-anagrams/

### Problem Statement
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

```
Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
```
### Constraints:

1 <= strs.length <= 10<sup>4</sup>

0 <= strs[i].length <= 100

strs[i] consists of lower-case English letters.


### Approach
* Every group of anangrams have some key which is sorted string of that group. So will create a map of that sorted string and a list of strings which is anagram to that key.
* Then we will iterate through every string and then convert it into a character array.
* Then will sort that array and add convert back to string.
* Then will add that sorted string into a HashMap.
* After iterating through every string, we will return the linkedList using LinkedList<>(map.values()).

**Time Complexity - O(NMlogM)**

**Space Complexity = O(NM)**

(where N is the length of the array and M is the length of word of maximum length)
