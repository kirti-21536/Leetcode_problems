// Last updated: 12/4/2025, 1:01:07 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        
4        int ans=Integer.MIN_VALUE;
5        int sum=0;
6        for(int i=0;i<nums.length;i++){
7            
8                sum+=nums[i];
9                ans=Math.max(ans,sum);
10                if(sum<0){
11                  sum=0;
12                  }
13            }
14        return ans;
15
16    
17    }
18}