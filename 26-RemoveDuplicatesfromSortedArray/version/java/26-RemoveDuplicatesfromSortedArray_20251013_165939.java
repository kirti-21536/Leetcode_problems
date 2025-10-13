// Last updated: 10/13/2025, 4:59:39 PM
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