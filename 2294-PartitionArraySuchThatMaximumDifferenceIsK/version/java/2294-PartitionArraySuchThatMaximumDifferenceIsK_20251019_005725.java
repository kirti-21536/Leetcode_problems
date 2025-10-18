// Last updated: 10/19/2025, 12:57:25 AM
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