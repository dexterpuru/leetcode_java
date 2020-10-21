#### Leetcode Link: 

https://leetcode.com/problems/find-and-replace-pattern/

### Problem Statement

You have a list of `words` and a `pattern`, and you want to know which words in `words` matches the pattern.

A word matches the pattern if there exists a permutation of letters `p` so that after replacing every letter `x` in the pattern with `p(x)`, we get the desired word.

(Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)

Return a list of the words in `words` that match the given pattern. 

You may return the answer in any order.

### Approach

If say, the first letter of the pattern is `"a"`, and the first letter of the word is `"x"`, then in the permutation, `"a"` must map to `"x"`.

We can write this bijection using two maps: a forward map `m1` and a backwards map `m2`.

`m1 : "a" → "x", m2 : "x" → "a"`

Then, if there is a contradiction later, we can catch it via one of the two maps. For example, if the `(word, pattern)` is `("aa", "xy")`, we will catch the mistake in `m1` (namely, `m1("a") = "x" = "y"`). Similarly, with `(word, pattern) = ("ab", "xx")`, we will catch the mistake in `m2`.

**Complexity Analysis**

* Time Complexity: O(N * K), where N is the number of words, and K is the length of each word.

* Space Complexity: O(N * K), the space used by the answer. 