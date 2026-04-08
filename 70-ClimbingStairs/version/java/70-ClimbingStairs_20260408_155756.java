// Last updated: 4/8/2026, 3:57:56 PM
1class Solution {
2    public int climbStairs(int n) {
3        if(n<=2)return n;
4        int dp[]=new int[n+1];
5        dp[0]=1;
6        dp[1]=1;
7        dp[2]=2;
8        for(int i=3;i<=n;i++){
9            dp[i]=dp[i-1]+dp[i-2];
10        }
11        return dp[n];
12    }
13    //top down approach(memoization)
14    // int dp[]=new int[n+1];
15    // Arrays.fill(dp,-1);
16    // return climb(n-1,dp)+climb(n-2,dp);
17    // }
18    // public int climb(int n,int dp[]){
19    //     if(n<=2)return n;
20    //     if(dp[n]!=-1)return dp[n];
21    //     return dp[n]=climb(n-1,dp)+climb(n-2,dp);
22    // }
23
24}