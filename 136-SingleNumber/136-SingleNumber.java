// Last updated: 8/1/2025, 8:15:46 PM
class Solution {
    public int singleNumber(int[] nums) {
        int val=0;
        for(int i=0;i<nums.length;i++){
            val=val^nums[i];
        }
        return val;
        
    }
}