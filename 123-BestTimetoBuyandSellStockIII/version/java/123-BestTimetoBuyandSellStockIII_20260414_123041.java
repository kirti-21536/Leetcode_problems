// Last updated: 4/14/2026, 12:30:41 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n = prices.length;
4        int[][] dp = new int[3][n]; // k = 2 → size 3
5
6        for (int k = 1; k <= 2; k++) {
7            int minPrice = prices[0];
8
9            for (int i = 1; i < n; i++) {
10                minPrice = Math.min(minPrice, prices[i] - dp[k - 1][i]);
11                dp[k][i] = Math.max(dp[k][i - 1], prices[i] - minPrice);
12            }
13        }
14
15        return dp[2][n - 1];
16    }
17}