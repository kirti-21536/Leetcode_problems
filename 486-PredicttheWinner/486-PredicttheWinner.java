// Last updated: 8/1/2026, 2:57:42 PM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        int n = nums.length;
4        int[][] dp = new int[n][n];
5        for (int i = 0; i < n; i++) {
6            dp[i][i] = nums[i];
7        }
8        for (int len = 2; len <= n; len++) {
9            for (int i = 0; i + len - 1 < n; i++) {
10                int j = i + len - 1;
11                dp[i][j] = Math.max(
12                    nums[i] - dp[i + 1][j],
13                    nums[j] - dp[i][j - 1]
14                );
15            }
16        }
17        return dp[0][n - 1] >= 0;
18        
19    }
20}