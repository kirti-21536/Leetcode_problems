// Last updated: 11/16/2025, 5:12:59 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int c=0;
       int maxC=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)c++;
            else{
                maxC=Math.max(c,maxC);
                c=0;
            }
            maxC=Math.max(c,maxC);
        }
      
        return maxC;
    }
}