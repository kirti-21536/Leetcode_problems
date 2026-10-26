// Last updated: 10/26/2026, 9:45:29 PM
1class Solution {
2    int m, n;
3    public int countIslands(int[][] grid, int k) {
4        m = grid.length;
5        n = grid[0].length;
6
7        int count = 0;
8
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11
12                if (grid[i][j] > 0) {
13                    long sum = dfs(grid, i, j);
14
15                    if (sum % k == 0) {
16                        count++;
17                    }
18                }
19            }
20        }
21
22        return count;
23    }
24
25    private long dfs(int[][] grid, int i, int j) {
26        if (i < 0 || j < 0 || i >= m || j >= n
27                || grid[i][j] == 0) {
28            return 0;
29        }
30
31        long sum = grid[i][j];
32
33        // Mark visited
34        grid[i][j] = 0;
35
36        sum += dfs(grid, i + 1, j);
37        sum += dfs(grid, i - 1, j);
38        sum += dfs(grid, i, j + 1);
39        sum += dfs(grid, i, j - 1);
40
41        return sum;
42    }
43}
44