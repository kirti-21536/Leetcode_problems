// Last updated: 3/1/2026, 4:29:46 PM
1class Solution {
2    public int findUnsortedSubarray(int[] nums) {
3        int n = nums.length;
4        int max = Integer.MIN_VALUE;
5        int min = Integer.MAX_VALUE;
6        int start = -1, end = -2; 
7        
8        // Left to right
9        for(int i = 0; i < n; i++) {
10            max = Math.max(max, nums[i]);
11            if(nums[i] < max) {
12                end = i;
13            }
14        }
15        
16        // Right to left
17        for(int i = n - 1; i >= 0; i--) {
18            min = Math.min(min, nums[i]);
19            if(nums[i] > min) {
20                start = i;
21            }
22        }
23        
24        return end - start + 1;
25    }
26}