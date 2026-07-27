// Last updated: 7/27/2026, 11:29:09 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n=nums.length;
4        int max1=0;
5        int max2=0;
6        for(int i=0;i<n;i++){
7            if(nums[i]>max1){
8                max2=max1;
9                max1=nums[i];
10            }
11            else if(nums[i]>max2){
12                    max2=nums[i];
13            }
14
15        }
16        return (max1-1)*(max2-1);
17        
18    }
19}