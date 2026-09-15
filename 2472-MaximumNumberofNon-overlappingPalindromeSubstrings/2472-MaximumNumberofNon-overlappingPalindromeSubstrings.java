// Last updated: 9/15/2026, 10:10:33 PM
1class Solution {
2    public int maxPalindromes(String s, int k) {
3        int n = s.length();
4        boolean[][] pal = new boolean[n][n];
5
6        for (int len = 1; len <= n; len++) {
7            for (int i = 0; i + len <= n; i++) {
8                int j = i + len - 1;
9
10                if (s.charAt(i) == s.charAt(j) &&
11                    (len <= 2 || pal[i + 1][j - 1])) {
12                    pal[i][j] = true;
13                }
14            }
15        }
16
17        int[] dp = new int[n + 1];
18
19        for (int i = 1; i <= n; i++) {
20            dp[i] = dp[i - 1];
21
22            for (int j = 0; j < i; j++) {
23                if (i - j >= k && pal[j][i - 1]) {
24                    dp[i] = Math.max(dp[i], dp[j] + 1);
25                }
26            }
27        }
28
29        return dp[n];
30    }
31}