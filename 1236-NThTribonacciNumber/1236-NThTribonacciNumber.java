// Last updated: 1/13/2026, 11:13:16 AM
class Solution {
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
        return solve(n,dp);
    }
    public int solve(int n,int dp[]){
        if(n==0)return 0;
        if(n==1 ||n==2)return 1;
        if(dp[n]!=0)return dp[n];
        return  dp[n]=solve(n-1,dp)+solve(n-2,dp)+solve(n-3,dp);
    }
}