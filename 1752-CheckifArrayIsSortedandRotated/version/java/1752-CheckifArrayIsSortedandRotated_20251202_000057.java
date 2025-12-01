// Last updated: 12/2/2025, 12:00:57 AM
1class Solution {
2    public boolean check(int[] nums) {
3        int n=nums.length;
4        int flag=0;
5        for(int i=0;i<n;i++){
6            if(nums[i]>nums[(i+1)%n])flag++;
7            if(flag>1){ 
8                //flag==1 case is of when smallest ele is placed just after largest after rotation  
9                return false;
10            }
11        }  
12    return true;
13    }
14}