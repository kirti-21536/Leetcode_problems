// Last updated: 1/3/2026, 4:17:54 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3
4        int[] dp = new int[amount + 1];
5        Arrays.fill(dp, amount + 1); 
6        dp[0] = 0; 
7        for (int i = 1; i <= amount; i++) {
8            for (int coin : coins) {
9                if (i >= coin) {
10                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
11                }
12            }
13        }
14        return dp[amount] > amount ? -1 : dp[amount];
15    }
16}
17