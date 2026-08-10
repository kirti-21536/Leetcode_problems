// Last updated: 8/10/2026, 12:18:09 PM
1class Solution {
2    public boolean winnerSquareGame(int n) {
3        boolean[] dp = new boolean[n + 1];
4        for (int i = 1; i <= n; i++) {
5            for (int j = 1; j * j <= i; j++) {
6                if (!dp[i - j * j]) {
7                    dp[i] = true;
8                    break;
9                }
10            }
11        }
12
13        return dp[n];
14    }
15}