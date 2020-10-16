#### Leetcode Link: 

https://leetcode.com/problems/friends-of-appropriate-ages/

### Problem Statement

Some people will make friend requests. The list of their ages is given and `ages[i]` is the age of the ith person. 

Person A will NOT friend request person B (B != A) if any of the following conditions are true:

```
    age[B] <= 0.5 * age[A] + 7
    age[B] > age[A]
    age[B] > 100 && age[A] < 100
```

Otherwise, A will friend request B.

Note that if A requests B, B does not necessarily request A.  Also, people will not friend request themselves.

How many total friend requests are made?

### Approach

For each pair `(ageA, countA)`, `(ageB, countB)`, if the conditions are satisfied with respect to age, then `countA * countB` pairs of people made friend requests.

If `ageA == ageB`, then we overcounted: we should have `countA * (countA - 1)` pairs of people making friend requests instead, as you cannot friend request yourself.

**Complexity Analysis**

* Time Complexity: O(A2 + N), where NNN is the number of people, and A is the number of ages.

* Space Complexity: O(A), the space used to store `count`.
