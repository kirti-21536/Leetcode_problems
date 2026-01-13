// Last updated: 1/13/2026, 11:10:57 AM
class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[k][k];
        int ans = 1;

        for (int num : nums) {
            int cur = num % k;
            for (int mod = 0; mod < k; mod++) {
                int prev = (mod - cur + k) % k;
                dp[mod][cur] = Math.max(dp[mod][cur], dp[mod][prev] + 1);
                ans = Math.max(ans, dp[mod][cur]);
            }
        }

        return ans;
    }
}

