// Last updated: 12/5/2025, 1:24:33 AM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n=nums.length;
4        HashSet<Integer> set =new HashSet<>();
5        for(int i=0;i<n;i++){
6            if(set.contains(nums[i]))return nums[i];
7            set.add(nums[i]);
8        }
9         return nums[0];    
10    }
11}