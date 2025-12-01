// Last updated: 12/2/2025, 12:48:10 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int maxc=0;
4        int c=0;
5        for(int ele:nums){
6            if(ele==1)c++;
7            else{
8                maxc=Math.max(maxc,c);
9                c=0;
10            }
11        }
12        maxc=Math.max(maxc,c);
13        return maxc;
14
15    }
16}