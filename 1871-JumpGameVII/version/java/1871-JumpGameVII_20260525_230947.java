// Last updated: 5/25/2026, 11:09:47 PM
1class Solution {
2    public boolean canReach(String s, int minJump, int maxJump) {
3        int n = s.length();
4        boolean[] dp = new boolean[n];
5        dp[0] = true;
6        int reachable = 0;
7        for (int i = 1; i < n; i++) {
8            //entering window
9            if (i - minJump >= 0 && dp[i - minJump]) {
10                reachable++;
11            }
12            //leaving window
13            if (i - maxJump - 1 >= 0 && dp[i - maxJump - 1]) {
14                reachable--;
15            }
16            dp[i] = reachable > 0 && s.charAt(i) == '0';
17        }
18        return dp[n - 1];
19    }
20}