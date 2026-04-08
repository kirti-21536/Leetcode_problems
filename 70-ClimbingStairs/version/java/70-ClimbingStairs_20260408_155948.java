// Last updated: 4/8/2026, 3:59:48 PM
1class Solution {
2    public int superEggDrop(int k, int n) {
3        int[][] dp = new int[n + 1][k + 1];
4        int m = 0;
5
6        while (dp[m][k] < n) {
7            m++;
8            for (int j = 1; j <= k; j++) {
9                dp[m][j] = dp[m - 1][j - 1] + dp[m - 1][j] + 1;
10            }
11        }
12        return m;
13    }
14}