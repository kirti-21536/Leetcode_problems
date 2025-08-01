// Last updated: 8/1/2025, 8:16:04 PM
class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return true;
            }
        
        }
        return false;
        
    }
}