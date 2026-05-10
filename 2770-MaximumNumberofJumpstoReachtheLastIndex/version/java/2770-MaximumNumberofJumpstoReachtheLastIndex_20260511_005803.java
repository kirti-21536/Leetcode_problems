// Last updated: 5/11/2026, 12:58:03 AM
1class Solution {
2    public int maximumJumps(int[] nums, int target) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        Arrays.fill(dp, -1);
6        dp[0] = 0;
7        for (int i = 1; i < n; i++) {
8            for (int j = 0; j < i; j++) {
9                if (dp[j] != -1 &&
10                    Math.abs(nums[i] - nums[j]) <= target) {
11                    dp[i] = Math.max(dp[i], dp[j] + 1);
12                }
13            }
14        }
15
16        return dp[n - 1];
17    }
18}