// Last updated: 8/1/2025, 8:15:10 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        while(i<n &&j<n){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
            i++;
            
        }
        for(int k=j;k<n;k++){
            nums[k]=0;
        }
       
        
    }
}