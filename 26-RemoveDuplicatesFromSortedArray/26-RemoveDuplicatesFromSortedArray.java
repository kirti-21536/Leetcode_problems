// Last updated: 8/1/2025, 8:16:36 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=nums[j]) {
            nums[++j]=nums[i];

           }
        }
        return j+1;
    }
}