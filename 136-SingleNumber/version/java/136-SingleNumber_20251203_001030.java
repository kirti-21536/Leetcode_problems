// Last updated: 12/3/2025, 12:10:30 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int val=0;
4        for(int i=0;i<nums.length;i++){
5            val=val^nums[i];
6        }
7        return val;
8        
9    }
10}