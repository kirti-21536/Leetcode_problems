// Last updated: 8/15/2026, 9:44:57 PM
1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int xor = 0;
4        int n = nums.length;
5        boolean nonZero = false;
6
7        for (int num : nums) {
8            xor ^= num;
9            if (num != 0) {
10                nonZero = true;
11            }
12        }
13        if (xor != 0) return n;
14        if (nonZero) return n - 1;
15        return 0;
16    }
17}