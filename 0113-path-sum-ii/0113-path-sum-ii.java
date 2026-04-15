import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        backtrack(root, targetSum, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(TreeNode node, int remainingSum, List<Integer> path, List<List<Integer>> result) {
        if (node == null) return;
        
        path.add(node.val);
        remainingSum -= node.val;
        
        // Check if leaf and sum matches
        if (node.left == null && node.right == null && remainingSum == 0) {
            result.add(new ArrayList<>(path));  // Add a copy of current path
        } else {
            backtrack(node.left, remainingSum, path, result);
            backtrack(node.right, remainingSum, path, result);
        }
        
        path.remove(path.size() - 1);  // Backtrack
    }
}
