// Last updated: 8/11/2026, 10:06:33 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        for(int i=1;i<n;i++){
6            if(nums[i]==nums[i-1])return true;
7        }
8        // for(int i=0;i<n;i++){
9        //     for(int j=i+1;j<n;j++){
10        //         if(nums[i]==nums[j])return true;
11        //     }
12        // }
13        return false;
14        
15    }
16}