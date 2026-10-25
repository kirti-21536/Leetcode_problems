// Last updated: 10/25/2026, 4:28:11 PM
1class Solution {
2    public int closedIsland(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
9                    if (grid[i][j] == 0) {
10                        dfs(grid, i, j);
11                    }
12                }
13            }
14        }
15
16        int count = 0;
17
18        for (int i = 1; i < m - 1; i++) {
19            for (int j = 1; j < n - 1; j++) {
20                if (grid[i][j] == 0) {
21                    count++;
22                    dfs(grid, i, j);
23                }
24            }
25        }
26
27        return count;
28    }
29
30    public void dfs(int[][] grid, int i, int j) {
31        int m = grid.length;
32        int n = grid[0].length;
33
34        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 1) {
35            return;
36        }
37
38        grid[i][j] = 1;
39
40        dfs(grid, i + 1, j);
41        dfs(grid, i - 1, j);
42        dfs(grid, i, j + 1);
43        dfs(grid, i, j - 1);
44    }
45}
46