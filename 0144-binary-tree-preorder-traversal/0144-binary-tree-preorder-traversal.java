import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);           // Visit root
        traverse(node.left, result);    // Visit left
        traverse(node.right, result);   // Visit right
    }
}
