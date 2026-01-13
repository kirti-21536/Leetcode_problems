// Last updated: 1/13/2026, 11:11:31 AM
class Solution {
    static final long MOD=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long ans=(pow(4,odd)*pow(5,even))%MOD;
        return (int)ans;
    }
    public long pow(long a, long b) {
        if (b == 0) return 1;

        long half = pow(a, b / 2);
        half = (half * half) % MOD;

        if (b % 2 == 1) {
            half = (half * a) % MOD;
        }

        return half;
    }
    
}