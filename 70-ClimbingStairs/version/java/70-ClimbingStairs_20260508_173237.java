// Last updated: 5/8/2026, 5:32:37 PM
1class Solution {
2    public int climbStairs(int n) {
3        int dp[]=new int[n+1];
4        Arrays.fill(dp,-1);
5        dp[0]=1;
6        dp[1]=1;
7        for(int i=2;i<=n;i++){
8            dp[i]=dp[i-1]+dp[i-2];
9        }
10        return dp[n];
11    }
12}