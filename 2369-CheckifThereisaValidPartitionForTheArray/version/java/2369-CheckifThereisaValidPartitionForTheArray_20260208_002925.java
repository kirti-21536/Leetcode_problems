// Last updated: 2/8/2026, 12:29:25 AM
1class Solution {
2    public boolean validPartition(int[] nums) {
3        int n = nums.length;
4        boolean[] dp = new boolean[n + 1];
5        dp[0] = true;
6
7        for (int i = 2; i <= n; i++) {
8            if (nums[i - 1] == nums[i - 2] && dp[i - 2]) {
9                dp[i] = true;
10            }
11            if (i >= 3 && dp[i - 3]) {
12                if (nums[i - 1] == nums[i - 2] &&
13                    nums[i - 2] == nums[i - 3]) {
14                    dp[i] = true;
15                }
16                if (nums[i - 3] + 1 == nums[i - 2] &&
17                    nums[i - 2] + 1 == nums[i - 1]) {
18                    dp[i] = true;
19                }
20            }
21        }
22
23        return dp[n];
24    }
25}