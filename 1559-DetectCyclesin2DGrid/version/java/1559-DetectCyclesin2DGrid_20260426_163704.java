// Last updated: 4/26/2026, 4:37:04 PM
1class Solution {
2    public boolean containsCycle(char[][] grid) {
3        int rows = grid.length;
4        int cols = grid[0].length;
5        
6        boolean[][] visited = new boolean[rows][cols];
7        
8        for (int i = 0; i < rows; i++) {
9            for (int j = 0; j < cols; j++) {
10                if (!visited[i][j]) {
11                    if (dfs(grid, visited, i, j, -1, -1, grid[i][j])) {
12                        return true;
13                    }
14                }
15            }
16        }
17        return false;
18    }
19    
20    private boolean dfs(char[][] grid, boolean[][] visited,int r, int c, int pr, int pc, char ch) {
21        if (visited[r][c]) return true;
22        
23        visited[r][c] = true;
24        
25        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
26        for (int[] d : dirs) {
27            int nr = r + d[0];
28            int nc = c + d[1];
29            
30            if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == ch) {
31                if (nr == pr && nc == pc) continue;
32                
33                if (dfs(grid, visited, nr, nc, r, c, ch)) {
34                    return true;
35                }
36            }
37        }
38        return false;
39    }
40}