// Last updated: 8/6/2026, 9:12:08 AM
1class Solution {
2    int[][] grid;
3    int n;
4    Integer[][][] dp;
5    public int cherryPickup(int[][] grid) {
6        this.grid = grid;
7        this.n = grid.length;
8        dp = new Integer[n][n][n];
9        return Math.max(0, dfs(0, 0, 0));
10    }
11
12    private int dfs(int r1, int c1, int r2) {
13        int c2 = r1 + c1 - r2;
14        // Out of bounds
15        if (r1 >= n || c1 >= n || r2 >= n || c2 >= n)
16            return Integer.MIN_VALUE;
17
18        // Thorn cell
19        if (grid[r1][c1] == -1 || grid[r2][c2] == -1)
20            return Integer.MIN_VALUE;
21
22        // Destination reached
23        if (r1 == n - 1 && c1 == n - 1)
24            return grid[r1][c1];
25
26        // Memoized answer
27        if (dp[r1][c1][r2] != null)
28            return dp[r1][c1][r2];
29
30        int cherries = grid[r1][c1];
31
32        // Avoid double counting if both are on same cell
33        if (r1 != r2 || c1 != c2)
34            cherries += grid[r2][c2];
35
36        int next = Math.max(
37                Math.max(dfs(r1 + 1, c1, r2 + 1),   // Down, Down
38                         dfs(r1 + 1, c1, r2)),      // Down, Right
39                Math.max(dfs(r1, c1 + 1, r2 + 1),   // Right, Down
40                         dfs(r1, c1 + 1, r2))       // Right, Right
41        );
42
43        if (next == Integer.MIN_VALUE)
44            return dp[r1][c1][r2] = Integer.MIN_VALUE;
45
46        return dp[r1][c1][r2] = cherries + next;
47    }
48}