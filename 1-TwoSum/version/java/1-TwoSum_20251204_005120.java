// Last updated: 12/4/2025, 12:51:20 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3          int arr[]=new int[2];
4
5        //for consecutive index
6        // for(int i=0;i<nums.length-1;i++){
7        //     if(nums[i]+nums[i+1]==target){
8        //         arr[0]=i;
9        //         arr[1]=i+1;
10        //         break;} 
11        // }
12
13       //for any index sum
14        for(int i=0;i<nums.length;i++){
15            for(int j=i+1;j<nums.length;j++){
16                if(nums[i]+nums[j]==target){
17                    arr[0]=i;
18                    arr[1]=j;
19                    break;
20                }
21            }
22        }
23        return arr;
24        
25    }
26}