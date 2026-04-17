// Last updated: 4/17/2026, 11:09:45 PM
1class Solution {
2    public int climbStairs(int n) {
3        int dp[]=new int[n+1];
4        Arrays.fill(dp,-1);
5        return solve(0,n,dp);
6    }
7    public int solve(int idx,int n,int dp[]){
8        if(idx==n)return 1;
9        if(idx>n)return 0;
10        if(dp[idx]!=-1)return dp[idx];
11        int step1=solve(idx+1,n,dp);
12        int step2=solve(idx+2,n,dp);
13        return dp[idx]=step1+step2;
14    }
15}