// Last updated: 10/6/2025, 11:18:20 AM
class Solution {
    public int climbStairs(int n) {
        if(n<0)return 0;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return stairs(n,dp);
        
    }
    public int stairs(int n,int dp[]){
        if(n==0 ||n==1)return 1;
        if(dp[n]!=-1)return dp[n];
        dp[n]=stairs(n-1,dp)+stairs(n-2,dp);
        return dp[n];
    }

}