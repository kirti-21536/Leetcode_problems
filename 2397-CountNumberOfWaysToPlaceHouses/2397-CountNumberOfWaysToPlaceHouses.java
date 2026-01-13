// Last updated: 1/13/2026, 11:11:18 AM
class Solution {
    long mod = 1000000007L;
    Long[][] dp;
    public int countHousePlacements(int n) {
        dp = new Long[n][2];
        long oneSide = solve(0, 0, n);
        return (int)((oneSide * oneSide) % mod);
    }
    public long solve(int i, int last, int n) {
        if (i == n) return 1;
        if (dp[i][last] != null) return dp[i][last];

        long ans = solve(i + 1, 0, n);   // place empty
        if (last == 0) {
            ans = (ans + solve(i + 1, 1, n)) % mod; // place house
        }

        return dp[i][last] = ans;
    }
}
