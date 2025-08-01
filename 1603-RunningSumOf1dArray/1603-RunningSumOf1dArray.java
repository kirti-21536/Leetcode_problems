// Last updated: 8/1/2025, 8:14:20 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int sum[]=new int[nums.length];
        int add=0;
        for(int i=0;i<nums.length;i++){
            add+=nums[i];
            sum[i]=add;

        }
        return sum;
    }
}