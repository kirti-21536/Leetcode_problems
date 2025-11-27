// Last updated: 11/27/2025, 11:45:51 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int gcount=1;
        int start=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-start>k){
                gcount++;
                start=nums[i];
            }
        }
        return gcount;
        
    }
}