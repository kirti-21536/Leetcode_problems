// Last updated: 5/2/2026, 10:37:47 PM
1class Solution {
2    public int rotatedDigits(int n) {
3        int count = 0;
4
5        for (int i = 1; i <= n; i++) {
6            if (isGood(i)) count++;
7        }
8
9        return count;
10    }
11
12    private boolean isGood(int num) {
13        boolean hasDifferent = false;
14
15        while (num > 0) {
16            int d = num % 10;
17
18            if (d == 3 || d == 4 || d == 7) return false;
19
20            if (d == 2 || d == 5 || d == 6 || d == 9) {
21                hasDifferent = true;
22            }
23
24            num /= 10;
25        }
26
27        return hasDifferent;
28    }
29}