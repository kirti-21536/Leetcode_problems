// Last updated: 8/28/2025, 1:24:54 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            //we access the left element of a pair that is min in those 
            // 2 elements in a pair after sorting
            sum+=nums[i];
        }
        return sum;
        
    }
}