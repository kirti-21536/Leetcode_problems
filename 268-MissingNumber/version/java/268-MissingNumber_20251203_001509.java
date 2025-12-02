// Last updated: 12/3/2025, 12:15:09 AM
1class Solution {
2    public int missingNumber(int[] nums) {
3        Arrays.sort(nums);
4        if(nums.length!=nums[nums.length-1])return nums.length;
5        int n=0;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]!=n){
8                return n;
9            }
10            
11            n++;
12        }
13        return 0;
14
15    }
16    }