// Last updated: 9/3/2025, 11:36:40 AM
class Solution {
    public int rob(int[] nums) {
        // odd even sum will not work when we skip 2 houses at a time.
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return Robber(nums,nums.length-1,dp);

    }
    public static int Robber(int nums[],int i,int dp[]){
        if(i<0)return 0;
        if(dp[i]!= -1){
            return dp[i];
        }
        int rob=nums[i]+Robber(nums,i-2,dp);
        int dont_rob=Robber(nums,i-1,dp);
        return dp[i]=Math.max(rob,dont_rob);
    }
}