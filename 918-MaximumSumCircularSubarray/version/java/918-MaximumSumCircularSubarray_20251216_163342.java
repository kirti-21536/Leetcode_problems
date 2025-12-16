// Last updated: 12/16/2025, 4:33:42 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int sum1=0;
4        int max=Integer.MIN_VALUE;
5        //Kadene's algo
6        for(int i=0;i<nums.length;i++){
7            sum1+=nums[i];
8            if(sum1>max){
9                max=sum1;
10            }
11            if(sum1<0){
12                sum1=0;
13            } 
14
15        }
16        int s=0;
17        for(int i=0;i<nums.length;i++){
18            s+=nums[i];
19        }
20        int sum=0;
21        int max1=Integer.MIN_VALUE;
22        for(int i=0;i<nums.length;i++){
23            int c=nums[i]*-1;
24            sum+=c;
25            if(sum>max1){
26                max1=sum;
27            }
28            if(sum<0){
29                sum=0;
30            } 
31
32        }
33        int ans=max1+s;
34        if(ans==0){
35            return max;
36        }
37        return Math.max(max,ans);
38        
39    }
40}