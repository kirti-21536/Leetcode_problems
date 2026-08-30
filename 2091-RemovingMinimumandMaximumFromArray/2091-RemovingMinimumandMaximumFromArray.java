// Last updated: 8/30/2026, 9:07:04 PM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int n = nums.length;
4        int minIndex = 0;
5        int maxIndex = 0;
6        
7        for (int i = 1; i < n; i++) {
8            if (nums[i] < nums[minIndex]) {
9                minIndex = i;
10            }
11
12            if (nums[i] > nums[maxIndex]) {
13                maxIndex = i;
14            }
15        }
16
17        int left = Math.min(minIndex, maxIndex);
18        int right = Math.max(minIndex, maxIndex);
19        int front = right + 1;
20        int back = n - left;
21        int both = (left + 1) + (n - right);
22
23        return Math.min(front, Math.min(back, both));
24        
25    }
26}