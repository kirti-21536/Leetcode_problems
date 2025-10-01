// Last updated: 10/1/2025, 2:47:44 PM
class Solution {
    public int jump(int[] nums) {
        int maxreach=0;
        int count=0;
        int endjump=0;
        for(int i=0;i<nums.length-1;i++){
            maxreach=Math.max(maxreach,nums[i]+i);
            if(i==endjump){
                count++;
                endjump=maxreach;

            }
        }
    return count;
        
    }
}