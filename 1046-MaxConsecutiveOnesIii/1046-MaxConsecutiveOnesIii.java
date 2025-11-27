// Last updated: 11/27/2025, 11:46:22 PM
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