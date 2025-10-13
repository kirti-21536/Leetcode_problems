// Last updated: 10/14/2025, 1:10:39 AM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int max=0;
        while(i<j){
            int sum=nums[i]+nums[j];
            max=Math.max(max,sum);
            i++;
            j--;
        }
        return max;
    }
}