// Last updated: 8/16/2026, 5:53:32 PM
1class Solution {
2    public boolean stoneGameIX(int[] stones) {
3        int[] cnt = new int[3];
4        for (int x : stones) {
5            cnt[x % 3]++;
6        }
7        if (cnt[0] % 2 == 0) {
8            return cnt[1] > 0 && cnt[2] > 0;
9        }
10        return Math.abs(cnt[1] - cnt[2]) > 2;
11    }
12}