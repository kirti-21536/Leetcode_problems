// Last updated: 8/9/2026, 5:21:04 PM
1class Solution {
2    int n;
3    int[] suffix;
4    int[][] dp;
5    public int stoneGameII(int[] piles) {
6        n = piles.length;
7        suffix = new int[n + 1];
8
9        for (int i = n - 1; i >= 0; i--)
10            suffix[i] = suffix[i + 1] + piles[i];
11
12        dp = new int[n][n + 1];
13
14        return solve(0, 1);
15    }
16
17    int solve(int i, int m) {
18        if (i >= n)
19            return 0;
20
21        if (dp[i][m] != 0)
22            return dp[i][m];
23
24        if (i + 2 * m >= n)
25            return dp[i][m] = suffix[i];
26
27        int ans = 0;
28
29        for (int x = 1; x <= 2 * m; x++) {
30            ans = Math.max(ans,
31                    suffix[i] - solve(i + x, Math.max(m, x)));
32        }
33
34        return dp[i][m] = ans;
35    }
36}