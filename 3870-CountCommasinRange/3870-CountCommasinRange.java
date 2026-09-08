// Last updated: 9/8/2026, 9:33:56 PM
1class Solution {
2    public int countCommas(int n) {
3        long ans = 0;
4
5        for (long p = 1000; p <= n; p *= 1000) {
6            ans += n - p + 1;
7        }
8
9        return (int)ans;
10    }
11}