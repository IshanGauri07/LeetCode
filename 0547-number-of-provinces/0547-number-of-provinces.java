import java.util.*;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        
        HashMap<Integer, Boolean> visited = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            visited.put(i, false);
        }

        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited.get(i)) {
                provinces++;
                dfs(i, isConnected, visited);
            }
        }

        return provinces;
    }

    private void dfs(int city, int[][] isConnected,
                     HashMap<Integer, Boolean> visited) {

        visited.put(city, true);

        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[city][j] == 1 && !visited.get(j)) {
                dfs(j, isConnected, visited);
            }
        }
    }
}