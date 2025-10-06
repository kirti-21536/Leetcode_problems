// Last updated: 10/6/2025, 7:56:56 PM
class Solution {
    public int fib(int n) {
        if(n<=1)return n;
        //bottom up approach
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }       
//         //top down approach
//         int dp[]=new int[n+1];
//         Arrays.fill(dp,-1);
//         return fibo(n-1,dp)+fibo(n-2,dp);
// }
//     public int fibo(int n,int dp[]){
//         if(n<=1)return n;
//         if(dp[n]!=-1)return dp[n];
//         return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
//     }
}