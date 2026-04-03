// Last updated: 4/3/2026, 11:34:48 PM
1class Solution {
2    public int uniquePaths(int m, int n) {
3        int[][] dp = new int[m][n];
4
5        for (int i = 0; i < m; i++) dp[i][0] = 1;
6        for (int j = 0; j < n; j++) dp[0][j] = 1;
7
8        for (int i = 1; i < m; i++) {
9            for (int j = 1; j < n; j++) {
10                dp[i][j] = dp[i-1][j] + dp[i][j-1];
11            }
12        }
13
14        return dp[m-1][n-1];
15    }
16}