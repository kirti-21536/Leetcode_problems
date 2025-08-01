// Last updated: 8/1/2025, 8:15:41 PM
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int leftpro=1;
        int rightpro=1;
        int ans=nums[0];
        for(int i=0;i<n;i++){
            leftpro=leftpro==0?1:leftpro;
            rightpro =rightpro==0?1:rightpro;
            leftpro *=nums[i];
            rightpro *=nums[n-i-1];
            ans=Math.max(ans,Math.max(leftpro,rightpro));
            


        }
        return ans;
    }
}