// Last updated: 8/26/2026, 11:51:05 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        int n=nums.length;
4        int lo=0;
5        int mid=0; //it is the moving pointer
6        int high=n-1;
7        while(mid<=high){
8            if(nums[mid]==0){
9                //swap nums[mid] with nums[lo] to get the zeros at the start
10                int temp=nums[mid];
11                nums[mid]=nums[lo];
12                nums[lo]=temp;
13                mid++;
14                lo++;
15            }
16            else if(nums[mid]==1){
17                mid++;
18            }
19            else{
20                //swap nums[high] with nums[mid]
21                int temp=nums[mid];
22                nums[mid]=nums[high];
23                nums[high]=temp;
24                high--;
25            }
26
27        }
28
29
30        
31    }
32}