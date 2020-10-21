import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return String.format(
        "* Actual=[%d]%s%s",
        val,
        Optional.ofNullable(left).map(tn -> String.format("** Left=[%s]", tn.toString()))
            .orElse(""),
        Optional.ofNullable(right).map(tn -> String.format("** Right=[%s]", tn.toString()))
            .orElse(""));
  }
}


public class Solution {
  public List<TreeNode> allPossibleFBT(int N) {
    // Recursive: build all possible FBT of leftSubTree and rightSubTree with number n
    if (N <= 0 || N % 2 == 0)
      return new ArrayList<>();

    // 1. if N = 3 , the number of nodes combination are as follows
    // left root right
    // 1 1 1
    // --------------N = 3, res = 1----------

    // 2. if N = 5 , the number of nodes combination are as follows
    // left root right
    // 1 1 3 (recursion)
    // 3 1 1
    // --------------N = 5, res = 1 + 1 = 2----------

    // 3. if N = 7 , the number of nodes combination are as follows
    // left root right
    // 1 1 5 (recursion)
    // 3 1 3
    // 5 1 1
    // --------------N = 7, res = 2 + 1 + 2 = 5----------

    // 4. in order to make full binary tree, the node number must increase by 2
    List<TreeNode> res = new ArrayList<>();
    if (N == 1) {
      res.add(new TreeNode(0));
      return res;
    }
    for (int i = 1; i < N; i += 2) {
      List<TreeNode> leftSubTrees = allPossibleFBT(i);
      List<TreeNode> rightSubTrees = allPossibleFBT(N - i - 1);
      for (TreeNode l : leftSubTrees) {
        for (TreeNode r : rightSubTrees) {
          TreeNode root = new TreeNode(0);
          root.left = l;
          root.right = r;
          res.add(root);
        }
      }
    }
    return res;
  }

  public static void main(String... args) {
    new Solution().allPossibleFBT(10).stream().forEach(System.out::println);
  }
}
