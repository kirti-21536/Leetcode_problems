// Last updated: 4/16/2026, 11:50:48 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxIndex=0;
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            if(i>maxIndex)return false;
7            maxIndex=Math.max(maxIndex,i+nums[i]);
8            if(maxIndex>=n)return true;
9        }
10        return true;
11    }
12}