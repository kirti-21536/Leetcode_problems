// Last updated: 8/17/2026, 1:54:24 PM
1class Solution {
2    public int stoneGameV(int[] stoneValue) {
3        int n = stoneValue.length;
4        int[] prefix = new int[n + 1];
5
6        for (int i = 0; i < n; i++) {
7            prefix[i + 1] = prefix[i] + stoneValue[i];
8        }
9
10        int[][] dp = new int[n][n];
11
12        for (int len = 2; len <= n; len++) {
13            for (int l = 0; l + len <= n; l++) {
14                int r = l + len - 1;
15
16                for (int k = l; k < r; k++) {
17                    int left = prefix[k + 1] - prefix[l];
18                    int right = prefix[r + 1] - prefix[k + 1];
19
20                    if (left < right) {
21                        dp[l][r] = Math.max(dp[l][r],
22                                left + dp[l][k]);
23                    } else if (left > right) {
24                        dp[l][r] = Math.max(dp[l][r],
25                                right + dp[k + 1][r]);
26                    } else {
27                        dp[l][r] = Math.max(dp[l][r],
28                                left + Math.max(dp[l][k], dp[k + 1][r]));
29                    }
30                }
31            }
32        }
33
34        return dp[0][n - 1];
35    }
36}