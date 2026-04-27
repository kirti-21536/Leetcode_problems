// Last updated: 4/27/2026, 2:58:01 PM
1class Solution {
2    public int minMoves2(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int median = nums[n / 2];
6        
7        int moves = 0;
8        for (int num : nums) {
9            moves += Math.abs(num - median);
10        }
11        
12        return moves;
13    }
14}