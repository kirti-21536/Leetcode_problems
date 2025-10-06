// Last updated: 10/6/2025, 9:05:05 PM
class Solution {
    public int[] countBits(int n) {
        int dp[]=new int[n+1];
        //top down approach
        Arrays.fill(dp,-1);
        for(int i=0;i<=n;i++){
            count(i,dp);
        }
        return dp;
    }
    public int count(int n,int dp[]){
        if(n==1 ||  n==0)return dp[n]=n;
        if(dp[n]!=-1)return dp[n];
        //recurrence relation=> bits(n)=bit(n/2)+(n%2)
        return dp[n]=count(n>>1,dp)+(n&1);
    }

        //bottom up approach
        // dp[0]=0;
        // if(n==0)return dp;
        // dp[1]=1;
        // for(int i=2;i<=n;i++){
        //     dp[i]=dp[i>>1]+(i&1);
        // }
        // return dp;
        
    // }
}