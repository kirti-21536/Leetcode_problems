// Last updated: 7/27/2026, 11:22:16 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n=nums.length;
4        int max=0;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7                max=Math.max(max,(nums[i]-1)*(nums[j]-1));
8            }
9
10        }
11        return max;
12        
13    }
14}