// Last updated: 8/1/2025, 8:16:57 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //for consecutive index
         int arr[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+nums[i+1]==target){
                arr[0]=i;
                arr[1]=i+1;
                break;} 
        }

       //for any index sum
        for(int i=0;i<nums.length-1;i++){
            int k=i+1;
            while(k<nums.length){
            if(nums[i]+nums[k]==target){
                arr[0]=i;
                arr[1]=k;
                break;

            }
            k++;
            }

        }
        return arr;
        
    }
}