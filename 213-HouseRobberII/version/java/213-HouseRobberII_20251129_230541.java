// Last updated: 11/29/2025, 11:05:41 PM
1class Solution {
2    public int rob(int[] nums) {
3         int n = nums.length;
4        if (n == 1) return nums[0];
5        
6        int[] dp1 = new int[n];
7        int[] dp2 = new int[n];
8        Arrays.fill(dp1, -1);
9        Arrays.fill(dp2, -1);
10
11        int case1 = Robber(nums, 0, n - 2, dp1); // exclude last
12        int case2 = Robber(nums, 1, n - 1, dp2); // exclude first
13        
14        return Math.max(case1, case2);
15    }
16
17    public static int Robber(int[] nums, int start, int end, int[] dp) {
18        if (start > end) return 0;
19        if (dp[end] != -1) return dp[end];
20
21        int rob = nums[end] + Robber(nums, start, end - 2, dp);
22        int dontRob = Robber(nums, start, end - 1, dp);
23
24        return dp[end] = Math.max(rob, dontRob);
25    }
26    }
27