import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        
        dfs(rooms, visited, 0);
        
        for (boolean v : visited) {
            if (!v) return false;
        }
        
        return true;
    }
    
    private void dfs(List<List<Integer>> rooms, boolean[] visited, int room) {
        visited[room] = true;
        
        for (int key : rooms.get(room)) {
            if (!visited[key]) {
                dfs(rooms, visited, key);
            }
        }
    }
}