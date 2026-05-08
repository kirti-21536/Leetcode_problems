// Last updated: 5/8/2026, 5:31:11 PM
1class Solution {
2    public int climbStairs(int n) {
3        int dp[]=new int[n+1];
4        Arrays.fill(dp,-1);
5        return climb(n,dp);
6    }
7    public int climb(int n,int dp[]){
8        if(n<=1)return 1;
9        if(dp[n]!=-1)return dp[n];
10        int step1=climb(n-1,dp);
11        int step2=climb(n-2,dp);
12        return dp[n]=step1+step2; 
13
14    }
15}