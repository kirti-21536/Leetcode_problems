// Last updated: 9/3/2026, 1:07:00 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3         int min = nums1[0];
4
5        for (int x : nums1) {
6            min = Math.min(min, x);
7        }
8        int target = min % 2;
9        for (int x : nums1) {
10            if (x % 2 != target && (x - min) % 2 != target) {
11                return false;
12            }
13        }
14        return true;
15    }
16}