// Last updated: 10/6/2025, 8:05:29 PM
class Solution {
    public int climbStairs(int n) {
        if(n<=2)return n;
    //top down approach(memoization)
    int dp[]=new int[n+1];
    Arrays.fill(dp,-1);
    return climb(n-1,dp)+climb(n-2,dp);
    }
    public int climb(int n,int dp[]){
        if(n<=2)return n;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=climb(n-1,dp)+climb(n-2,dp);
    }

}