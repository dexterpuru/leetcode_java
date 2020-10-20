#### Leetcode Link: 

https://leetcode.com/problems/boats-to-save-people/

### Problem Statement

The `i`-th person has weight `people[i]`, and each boat can carry a maximum weight of `limit`.

Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most `limit`.

Return the minimum number of boats to carry every given person.  (It is guaranteed each person can be carried by a boat.)

### Approach

If the heaviest person can share a boat with the lightest person, then do so. Otherwise, the heaviest person can't pair with anyone, so they get their own boat.

The reason this works is because if the lightest person can pair with anyone, they might as well pair with the heaviest person.

Let `people[i]` to the currently lightest person, and `people[j]` to the heaviest.

Then, as described above, if the heaviest person can share a boat with the lightest person (if `people[j] + people[i] <= limit`) then do so; otherwise, the heaviest person sits in their own boat.

**Complexity Analysis**

* Time Complexity: O(N log N), where N is the length of `people`.

* Space Complexity: O(N). 
