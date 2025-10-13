// Last updated: 10/13/2025, 4:59:55 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[k]!=nums[i]){
                nums[++k]=nums[i];
            }
        }
          return k+1;
    }     
}