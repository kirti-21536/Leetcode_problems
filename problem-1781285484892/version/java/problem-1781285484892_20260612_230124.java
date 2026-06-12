// Last updated: 6/12/2026, 11:01:24 PM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int m = s.length();
4        int n = p.length();
5
6        boolean[][] dp = new boolean[m + 1][n + 1];
7        dp[0][0] = true;
8
9        for (int j = 1; j <= n; j++) {
10            if (p.charAt(j - 1) == '*') {
11                dp[0][j] = dp[0][j - 1];
12            }
13        }
14
15        for (int i = 1; i <= m; i++) {
16            for (int j = 1; j <= n; j++) {
17                char pc = p.charAt(j - 1);
18
19                if (pc == '*') {
20                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
21                } else if (pc == '?' || pc == s.charAt(i - 1)) {
22                    dp[i][j] = dp[i - 1][j - 1];
23                }
24            }
25        }
26
27        return dp[m][n];
28    }
29}