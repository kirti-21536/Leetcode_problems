// Last updated: 12/6/2025, 1:11:58 AM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n=nums.length;
4        Arrays.sort(nums);
5        int ans=0;
6        for(int i=0;i<n;i++){
7            if(nums[i]==nums[i+1]){
8                ans= nums[i];
9                break;
10            }
11        }
12        return ans;
13
14    }
15}