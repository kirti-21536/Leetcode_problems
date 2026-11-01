// Last updated: 11/1/2026, 11:16:23 PM
1
2class Solution {
3    public int minMoves(int[] nums) {
4        int min = Integer.MAX_VALUE;
5
6        for (int num : nums) {
7            min = Math.min(min, num);
8        }
9        int moves = 0;
10        for (int num : nums) {
11            moves += num - min;
12        }
13        return moves;
14    }
15}
16