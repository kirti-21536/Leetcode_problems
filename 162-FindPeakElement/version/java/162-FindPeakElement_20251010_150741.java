// Last updated: 10/10/2025, 3:07:41 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int idx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                idx=i;
            }
        }
        return idx;
    }
}