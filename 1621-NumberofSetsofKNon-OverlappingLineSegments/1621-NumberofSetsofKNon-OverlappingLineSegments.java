// Last updated: 9/17/2026, 12:16:46 AM
1class Solution {
2    public int numberOfSets(int n, int k) {
3        long ans = 1;
4        int mod = 1_000_000_007;
5
6        for (int i = 1; i <= 2 * k; i++) {
7            ans = ans * (n + k - i) % mod;
8            ans = ans * modInverse(i, mod) % mod;
9        }
10
11        return (int) ans;
12    }
13
14    private long modInverse(long x, int mod) {
15        return power(x, mod - 2, mod);
16    }
17
18    private long power(long x, int y, int mod) {
19        long res = 1;
20
21        while (y > 0) {
22            if ((y & 1) == 1) {
23                res = res * x % mod;
24            }
25
26            x = x * x % mod;
27            y >>= 1;
28        }
29
30        return res;
31    }
32}