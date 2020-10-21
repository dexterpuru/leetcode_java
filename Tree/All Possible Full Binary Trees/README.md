#### Leetcode Link: 

https://leetcode.com/problems/all-possible-full-binary-trees/

### Problem Statement

A full binary tree is a binary tree where each node has exactly 0 or 2 children.

Return a list of all possible full binary trees with `N` nodes.  Each element of the answer is the root node of one possible tree.

Each `node` of each tree in the answer must have `node.val = 0`.

You may return the final list of trees in any order.

Note: `1 <= N <= 20`

### Approach

Let `FBT(N)` be the list of all possible full binary trees with `N` nodes.

Every full binary tree `T` with 3 or more nodes, has 2 children at its root. Each of those children `left` and `right` are themselves full binary trees.

Thus, for `N ≥ 3`, we can formulate the recursion: `FBT(N) = [All trees with left child from FBT(x) and right child from FBT(N − 1 − x), for all x]`.

Also, by a simple counting argument, there are no full binary trees with a positive, even number of nodes.

Finally, we should cache previous results of the function `FBT` so that we don't have to recalculate them in our recursion.

**Complexity Analysis**

* Time Complexity: `O(2^N)`. For odd `N`, let `N = 2k + 1`. Then, `∣FBT(N)∣  = C(k)`​, the `k`-th catalan number; and `∑ C(k)(k < N/2)`​ (the complexity involved in computing intermediate results required) is bounded by `O(2^N)`. However, the proof is beyond the scope of this article.

* Space Complexity: `O(2^N)`. 