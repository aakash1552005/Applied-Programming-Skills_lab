import java.util.*;

class Solution {
    static class NodeInfo {
        int row, val;
        NodeInfo(int row, int val) {
            this.row = row;
            this.val = val;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<NodeInfo>> map = new TreeMap<>();
        dfs(root, 0, 0, map);
        
        List<List<Integer>> result = new ArrayList<>();
        for (List<NodeInfo> nodes : map.values()) {
            // Sort by row first, then value
            Collections.sort(nodes, (a, b) -> {
                if (a.row != b.row) return Integer.compare(a.row, b.row);
                return Integer.compare(a.val, b.val);
            });
            
            List<Integer> col = new ArrayList<>();
            for (NodeInfo ni : nodes) col.add(ni.val);
            result.add(col);
        }
        
        return result;
    }
    
    private void dfs(TreeNode node, int row, int col, Map<Integer, List<NodeInfo>> map) {
        if (node == null) return;
        map.computeIfAbsent(col, k -> new ArrayList<>()).add(new NodeInfo(row, node.val));
        dfs(node.left, row + 1, col - 1, map);
        dfs(node.right, row + 1, col + 1, map);
    }
}
