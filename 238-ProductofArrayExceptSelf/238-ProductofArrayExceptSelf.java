// Last updated: 8/11/2026, 10:40:29 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n=nums.length;
4        int suffix=1;
5        int prefix[]=new int[n];
6        prefix[0]=1;
7        for(int i=1;i<n;i++){
8            prefix[i]=prefix[i-1]*nums[i-1];
9        }
10        for(int i=n-1;i>=0;i--){
11            prefix[i]=suffix*prefix[i];
12            suffix*=nums[i];
13        }
14        return prefix;
15    }
16}