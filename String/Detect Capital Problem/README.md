#### Leetcode Link: 

> https://leetcode.com/problems/detect-capital/

### Problem Statement

> Given a word, you need to judge whether the usage of capitals in it is right or not.
>
> We define the usage of capitals in a word to be right when one of the following cases holds:
>
> All letters in this word are capitals, like "USA".
>
> All letters in this word are not capitals, like "leetcode".
>
> Only the first letter in this word is capital, like "Google".
>
> Otherwise, we define that this word doesn't use capitals in a right way.
>
> **Example 1:**
>
> ```
> Input: "USA"
> 
> Output: True

>
> **Example 2:**
>
> ```
> Input: "FlaG"
> 
> Output: False
>
> ```

### Approach

* First we convert the input string into UpperCase and call it **s1** , then I compare the given input with **s1**, if it matches then ouput will be **true**.

* Then we convert the input string into LowerCase and call it **s2** , then I compare the given input with **s2**, if it matches then ouput will be **true**.

* Then we check whether the input string has the first letter as UpperCase and store the result in **s3** , then we compare the input string with **s3**, if it matches then **true**.

* Then we store the substring from position 1 to the length of the given input string and store it into **s4**, then we compare both the given string and **s4**, it it matches then **true**.

* If none of the above following conditions satisfies, then we return **false**.

  **Time Complexity: O(n), where n is the length of the string.**, 
  **Space Complexity: O(n), where n is the length of the string.**
