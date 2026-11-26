// Last updated: 11/26/2026, 11:25:05 PM
1class Solution {
2    public boolean canAliceWin(int n) {
3        int take = 10;
4        boolean win = false;
5
6        while (n >= take) {
7            n -= take;
8            take--;
9            win = !win;
10        }
11
12        return win;
13    }
14}