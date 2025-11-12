// Last updated: 11/13/2025, 12:11:30 AM
class Solution {
    public int rob(int[] nums) {
         int n = nums.length;
        if (n == 1) return nums[0];
        
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int case1 = Robber(nums, 0, n - 2, dp1); // exclude last
        int case2 = Robber(nums, 1, n - 1, dp2); // exclude first
        
        return Math.max(case1, case2);
    }

    public static int Robber(int[] nums, int start, int end, int[] dp) {
        if (start > end) return 0;
        if (dp[end] != -1) return dp[end];

        int rob = nums[end] + Robber(nums, start, end - 2, dp);
        int dontRob = Robber(nums, start, end - 1, dp);

        return dp[end] = Math.max(rob, dontRob);
    }
    }
