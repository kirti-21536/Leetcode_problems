// Last updated: 10/12/2025, 11:12:43 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zcount=0;
        int left=0;
        int maxl=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0)zcount++;
            while(zcount>k){
                if(nums[left]==0){zcount--;}
                left++;
            }
            maxl=Math.max(maxl,r-left+1);
        }
        return maxl;
    }
}