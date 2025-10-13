// Last updated: 10/14/2025, 12:20:34 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int si=0;
        int sum=0;
        int minl=Integer.MAX_VALUE;
        for(int ei=0;ei<nums.length;ei++){
            sum+=nums[ei];

            while(sum>=target){
                minl=Math.min(minl,ei-si+1);
                sum-=nums[si];
                si++;
            }
        }
        return minl==Integer.MAX_VALUE?0:minl;        
    }
}