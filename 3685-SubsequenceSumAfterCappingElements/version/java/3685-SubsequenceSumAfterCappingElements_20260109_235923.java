// Last updated: 1/9/2026, 11:59:23 PM
1class Solution {
2    public int maximumLength(int[] nums, int k) {
3        int[][] dp = new int[k][k];
4        int ans = 1;
5
6        for (int num : nums) {
7            int cur = num % k;
8            for (int mod = 0; mod < k; mod++) {
9                int prev = (mod - cur + k) % k;
10                dp[mod][cur] = Math.max(dp[mod][cur], dp[mod][prev] + 1);
11                ans = Math.max(ans, dp[mod][cur]);
12            }
13        }
14
15        return ans;
16    }
17}
18
19