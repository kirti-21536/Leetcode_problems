// Last updated: 4/29/2026, 11:20:02 PM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5
6        if (obstacleGrid[0][0] == 1) return 0;
7
8        int[][] dp = new int[m][n];
9        dp[0][0] = 1;
10
11        for (int i = 1; i < m; i++) {
12            if (obstacleGrid[i][0] == 0) {
13                dp[i][0] = dp[i - 1][0];
14            }
15        }
16
17        for (int j = 1; j < n; j++) {
18            if (obstacleGrid[0][j] == 0) {
19                dp[0][j] = dp[0][j - 1];
20            }
21        }
22
23        for (int i = 1; i < m; i++) {
24            for (int j = 1; j < n; j++) {
25                if (obstacleGrid[i][j] == 0) {
26                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
27                }
28            }
29        }
30
31        return dp[m - 1][n - 1];
32    }
33}