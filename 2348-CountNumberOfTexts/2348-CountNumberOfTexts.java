// Last updated: 1/30/2026, 12:26:11 PM
class Solution {
    static final int MOD = 1_000_000_007;
    public int countTexts(String pressedKeys) {
        int n = pressedKeys.length();
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            char c = pressedKeys.charAt(i - 1);
            int limit = (c == '7' || c == '9') ? 4 : 3;
            
            for (int k = 1; k <= limit && i - k >= 0; k++) {
                if (pressedKeys.charAt(i - k) != c) break;
                dp[i] = (dp[i] + dp[i - k]) % MOD;
            }
        }
        return (int) dp[n];
    }
}
