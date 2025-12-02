// Last updated: 12/2/2025, 11:31:32 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int k=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[k]!=nums[i]){
6                nums[++k]=nums[i];
7            }
8        }
9        return k+1;
10
11    }
12}