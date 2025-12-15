// Last updated: 12/15/2025, 10:29:27 AM
1class Solution {
2    public long getDescentPeriods(int[] prices) {
3        long ans = 1;    
4        long len = 1;     
5        for (int i = 1; i < prices.length; i++) {
6            if (prices[i] == prices[i - 1] - 1) {
7                len++;
8            } else {
9                len = 1;
10            }
11            ans += len;
12        }
13
14        return ans;
15    }
16}
17