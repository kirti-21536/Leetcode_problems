// Last updated: 1/30/2026, 12:25:57 PM
class Solution {
    static final int MOD = 1_000_000_007;

    public int monkeyMove(int n) {
        long totalWays = modPow(2, n);
        long ans = (totalWays - 2 + MOD) % MOD;
        return (int) ans;
    }

    private long modPow(long base, int exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}
