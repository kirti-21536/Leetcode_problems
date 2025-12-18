// Last updated: 12/19/2025, 12:48:53 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n=nums.length;
4        int leftpro=1;
5        int rightpro=1;
6        int ans=nums[0];
7        for(int i=0;i<n;i++){
8            leftpro=leftpro==0?1:leftpro;
9            rightpro =rightpro==0?1:rightpro;
10            leftpro *=nums[i];
11            rightpro *=nums[n-i-1];
12            ans=Math.max(ans,Math.max(leftpro,rightpro));
13            
14
15
16        }
17        return ans;
18    }
19}