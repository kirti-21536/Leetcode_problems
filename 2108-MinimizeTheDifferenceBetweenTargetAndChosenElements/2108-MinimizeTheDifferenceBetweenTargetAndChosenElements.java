// Last updated: 1/30/2026, 12:26:22 PM
class Solution {
    public int minimizeTheDifference(int[][] mat, int target) {
        int m = mat.length;
        int maxSum = 70 * 70; // max value 
        boolean[] dp = new boolean[maxSum + 1];
        dp[0] = true;

        for (int i = 0; i < m; i++) {
            boolean[] next = new boolean[maxSum + 1];
            for (int s = 0; s <= maxSum; s++) {
                if (!dp[s]) continue;
                for (int val : mat[i]) {
                    if (s + val <= maxSum) {
                        next[s + val] = true;
                    }
                }
            }
            dp = next;
        }

        int ans = Integer.MAX_VALUE;
        for (int s = 0; s <= maxSum; s++) {
            if (dp[s]) {
                ans = Math.min(ans, Math.abs(s - target));
            }
        }
        return ans;
    }
}
