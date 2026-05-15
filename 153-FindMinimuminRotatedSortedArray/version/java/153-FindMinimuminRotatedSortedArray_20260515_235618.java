// Last updated: 5/15/2026, 11:56:18 PM
1class Solution {
2    public int findMin(int[] nums) {
3        // int min=Integer.MAX_VALUE:
4        // for(int i:nums){
5        //     min=Math.min(i,min);
6        // }
7        
8        int left = 0;
9        int right = nums.length-1;
10
11        if(nums[left]<=nums[right]){
12            return nums[left];
13        }
14
15        while(left<=right){
16            int mid = left+(right-left);
17
18            if(mid>0 && nums[mid]<=nums[mid-1])return nums[mid];
19            if(mid<nums.length-1 && nums[mid]>=nums[mid+1])return nums[mid+1];
20
21            if(nums[mid]>nums[right]){
22                left = mid+1;
23            }else{
24                right = mid-1;
25            }
26        }
27        return -1;
28    }
29}