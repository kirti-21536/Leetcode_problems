// Last updated: 1/6/2026, 1:14:08 PM
1class Solution {
2    static final long MOD=1000000007;
3    public int countGoodNumbers(long n) {
4        long even=(n+1)/2;
5        long odd=n/2;
6        long ans=(pow(4,odd)*pow(5,even))%MOD;
7        return (int)ans;
8    }
9    public long pow(long a, long b) {
10        if (b == 0) return 1;
11
12        long half = pow(a, b / 2);
13        half = (half * half) % MOD;
14
15        if (b % 2 == 1) {
16            half = (half * a) % MOD;
17        }
18
19        return half;
20    }
21    
22}