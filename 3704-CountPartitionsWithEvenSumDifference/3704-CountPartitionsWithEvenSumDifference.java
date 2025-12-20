// Last updated: 12/20/2025, 11:55:34 PM
class Solution {
    public int countPartitions(int[] nums) {
        int sum1=0;
        for(int i:nums){
            sum1+=i;
        }
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            sum1-=nums[i];
            if((sum1-sum)%2==0)count++;
        }
        return count;
    }
}