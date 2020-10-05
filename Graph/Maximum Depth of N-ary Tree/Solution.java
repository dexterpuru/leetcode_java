class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        return maxDepthRecursive(root);
        
    }
    
    private int maxDepthRecursive(Node root) {
        if (root == null) return 0;
        if (root.children.size() == 0) return 1;
        int result = 0;
        for (int i=0; i<root.children.size(); i++) {
            result = Math.max(result, maxDepthRecursive(root.children.get(i)));
        }
        return result+1;
    }
}