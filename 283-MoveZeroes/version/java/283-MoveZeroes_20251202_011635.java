// Last updated: 12/2/2025, 1:16:35 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n=nums.length;
4        int i=0; //pointer for insertion position 
5        for(int j=0;j<n;j++){
6            if(nums[j]!=0){
7                nums[i]=nums[j];
8                i++;
9            }
10        }
11        for(int k=i;k<n;k++){
12            nums[k]=0;
13        }
14    }
15}