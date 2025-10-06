// Last updated: 10/6/2025, 11:36:47 AM
class Solution {
    public int[] countBits(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        if(n==0)return dp;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i>>1]+(i&1);
        }
        return dp;
        
    }
}