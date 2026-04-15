class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;  // both in left subtree
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right; // both in right subtree
            } else {
                return root; // split point = LCA
            }
        }
        return null;
    }
}