// Last updated: 8/1/2025, 8:14:18 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
         int count=0;
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
           
            while(j<nums.length){
                if(nums[i]==nums[j]){
                    count++;
                }
                j++;
            }
        }
        return count;
    }
}