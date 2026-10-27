// Last updated: 10/27/2026, 6:57:33 PM
1class Solution {
2    public String[] createGrid(int m, int n) {
3        char[][] grid = new char[m][n];
4
5        for (int i = 0; i < m; i++) {
6            Arrays.fill(grid[i], '#');
7        }
8
9        Arrays.fill(grid[0], '.');
10
11        for (int i = 0; i < m; i++) {
12            grid[i][n - 1] = '.';
13        }
14
15        String[] ans = new String[m];
16
17        for (int i = 0; i < m; i++) {
18            ans[i] = new String(grid[i]);
19        }
20
21        return ans;
22    }
23}
24