// Last updated: 9/9/2026, 9:26:38 PM
1class Solution {
2    public long countCommas(long n) {
3        long ans = 0;
4        long p = 1000;
5
6        while (p <= n) {
7            ans += n - p + 1;
8            p *= 1000;
9        }
10
11        return ans;
12        
13    }
14}