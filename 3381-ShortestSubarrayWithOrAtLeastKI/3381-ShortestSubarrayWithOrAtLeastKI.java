// Last updated: 1/13/2026, 11:11:01 AM
class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int ans=0;
            for(int j=i;j<n;j++){
                ans=ans|nums[j];
                if(ans>=k){
                    res=Math.min(res,j-i+1);
                    break;
                }
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}