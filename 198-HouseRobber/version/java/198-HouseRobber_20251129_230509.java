// Last updated: 11/29/2025, 11:05:09 PM
1class Solution {
2    public int rob(int[] nums) {
3        // odd even sum will not work when we skip 2 houses at a time.
4        int dp[]=new int[nums.length];
5        Arrays.fill(dp,-1);
6        return Robber(nums,nums.length-1,dp);
7
8    }
9    public static int Robber(int nums[],int i,int dp[]){
10        if(i<0)return 0;
11        if(dp[i]!= -1){
12            return dp[i];
13        }
14        int rob=nums[i]+Robber(nums,i-2,dp);
15        int dont_rob=Robber(nums,i-1,dp);
16        return dp[i]=Math.max(rob,dont_rob);
17    }
18}