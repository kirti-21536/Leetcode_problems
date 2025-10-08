// Last updated: 10/8/2025, 11:35:14 AM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        //top down approach(memoization)
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(climb(n-1,cost,dp),climb(n-2,cost,dp));
    }
    public int climb(int n,int cost[],int dp[]){
        if(n<=1)return cost[n];
        if(dp[n]!=-1)return dp[n];
        return dp[n]=cost[n]+Math.min(climb(n-1,cost,dp),climb(n-2,cost,dp));
    }
        //bottom up approach(tabulation)
    //     int dp[]=new int[n+1];
    //     dp[0]=cost[0];
    //     dp[1]=cost[1];
    //     for(int i=2;i<n;i++){
    //         dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
    //     }
    //     dp[n]=Math.min(dp[n-1],dp[n-2]);
    //     return dp[n];

    // }
}