import java.util.Stack;

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        
        while (true) {
            // Go left as much as possible
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();
            k--;
            
            if (k == 0) {
                return root.val;
            }
            
            root = root.right;
        }
    }
}