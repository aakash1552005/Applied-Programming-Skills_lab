class Solution {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        // Update diameter
        diameter = Math.max(diameter, left + right);

        // Return height of current node
        return 1 + Math.max(left, right);
    }
}