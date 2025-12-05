// Last updated: 12/6/2025, 1:25:33 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        for(int i:nums){
5            min=Math.min(i,min);
6        }
7        return min;
8        
9    }
10}