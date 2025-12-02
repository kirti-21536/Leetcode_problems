// Last updated: 12/2/2025, 11:45:22 PM
1class Solution {
2    public int maximumGap(int[] nums) {
3        int n=nums.length;
4        if(n<2)return 0;
5        Arrays.sort(nums);
6        int max=0;
7        for(int i=1;i<n;i++){
8            int diff=nums[i]-nums[i-1];
9            max=Math.max(diff,max);  
10        }
11        return max;
12
13        
14    }
15}