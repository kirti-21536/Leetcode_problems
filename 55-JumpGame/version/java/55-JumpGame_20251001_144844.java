// Last updated: 10/1/2025, 2:48:44 PM
class Solution {
    public boolean canJump(int[] nums) {
        int maxreach=0;
       
        for(int i=0;i<nums.length-1;i++){
            maxreach=Math.max(maxreach,nums[i]+i);

            if(i==maxreach){
                return false;
            }
        }
    return true;
    }
}