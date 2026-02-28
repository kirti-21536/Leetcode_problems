// Last updated: 3/1/2026, 12:35:24 AM
1class Solution {
2    public int concatenatedBinary(int n) {
3        long ans = 0;
4        int mod = 1000000007;
5        int len = 0;
6
7        for (int i = 1; i <= n; i++) {
8            if ((i & (i - 1)) == 0) len++;
9            ans = ((ans << len) + i) % mod;
10        }
11        return (int) ans;
12    }
13}