// Last updated: 3/3/2026, 7:02:15 PM
1class Solution {
2    long mod = 1000000007;
3
4    long power(long a, long b) {
5        long res = 1;
6        a %= mod;
7        while (b > 0) {
8            if ((b & 1) == 1) res = (res * a) % mod;
9            a = (a * a) % mod;
10            b >>= 1;
11        }
12        return res;
13    }
14
15    public int minNonZeroProduct(int p) {
16        long max = (1L << p) - 1;
17        long exp = (max - 1) / 2;
18        long part = power(max - 1, exp);
19        return (int)((max % mod) * part % mod);
20    }
21}