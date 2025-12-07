// Last updated: 12/7/2025, 6:52:52 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        for(int i:nums){
5            min=Math.min(min,i);
6        }
7        return min;
8        
9    }
10}