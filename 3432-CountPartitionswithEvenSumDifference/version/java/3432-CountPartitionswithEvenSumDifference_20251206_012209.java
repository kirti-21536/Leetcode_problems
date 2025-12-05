// Last updated: 12/6/2025, 1:22:09 AM
1class Solution {
2    public int countPartitions(int[] nums) {
3        int sum1=0;
4        for(int i:nums){
5            sum1+=i;
6        }
7        int count=0;
8        int sum=0;
9        for(int i=0;i<nums.length-1;i++){
10            sum+=nums[i];
11            sum1-=nums[i];
12            if((sum1-sum)%2==0)count++;
13        }
14        return count;
15    }
16}