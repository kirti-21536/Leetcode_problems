// Last updated: 4/20/2026, 12:31:02 AM
1class Solution {
2    public int maxDistance(int[] nums1, int[] nums2) {
3        int i = 0, j = 0;
4        int maxDist = 0;
5
6        while (i < nums1.length && j < nums2.length) {
7            if (nums1[i] <= nums2[j]) {
8                maxDist = Math.max(maxDist, j - i);
9                j++;
10            } else {
11                i++;
12            }
13        }
14
15        return maxDist;
16    }
17}