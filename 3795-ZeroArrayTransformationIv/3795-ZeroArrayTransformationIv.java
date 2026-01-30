// Last updated: 1/30/2026, 12:25:39 PM
class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int q = queries.length;

        int left = 0, right = q, ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canMakeZero(nums, queries, mid)) {
                ans = mid;
                right = mid - 1; // trying smaller k
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public boolean canMakeZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean[] dp = new boolean[nums[i] + 1];
            dp[0] = true;

            for (int j = 0; j < k; j++) {
                int l = queries[j][0];
                int r = queries[j][1];
                int val = queries[j][2];

                if (l <= i && i <= r) {
                    for (int s = nums[i]; s >= val; s--) {
                        dp[s] |= dp[s - val];
                    }
                }
            }

            if (!dp[nums[i]])
                return false;
        }
        return true;
    }

}
