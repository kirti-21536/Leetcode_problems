// Last updated: 10/31/2026, 12:07:26 PM
1class Solution {
2    public int uniquePaths(int[][] grid) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        int MOD = 1_000_000_007;
8
9        int[][][] dp = new int[m][n][2];
10
11        // Starting point
12        dp[0][0][0] = 1;
13
14        for (int i = 0; i < m; i++) {
15            for (int j = 0; j < n; j++) {
16
17                for (int d = 0; d < 2; d++) {
18
19                    int ways = dp[i][j][d];
20
21                    if (ways == 0) continue;
22
23                    // Starting cell: choose right or down
24                    if (i == 0 && j == 0) {
25
26                        if (j + 1 < n) {
27                            dp[i][j + 1][0] =
28                                (dp[i][j + 1][0] + ways) % MOD;
29                        }
30
31                        if (i + 1 < m) {
32                            dp[i + 1][j][1] =
33                                (dp[i + 1][j][1] + ways) % MOD;
34                        }
35
36                    }
37
38                    // Empty cell
39                    else if (grid[i][j] == 0) {
40
41                        if (j + 1 < n) {
42                            dp[i][j + 1][0] =
43                                (dp[i][j + 1][0] + ways) % MOD;
44                        }
45
46                        if (i + 1 < m) {
47                            dp[i + 1][j][1] =
48                                (dp[i + 1][j][1] + ways) % MOD;
49                        }
50
51                    }
52
53                    // Mirror cell
54                    else {
55
56                        if (d == 0 && i + 1 < m) {
57                            dp[i + 1][j][1] =
58                                (dp[i + 1][j][1] + ways) % MOD;
59                        }
60
61                        else if (d == 1 && j + 1 < n) {
62                            dp[i][j + 1][0] =
63                                (dp[i][j + 1][0] + ways) % MOD;
64                        }
65                    }
66                }
67            }
68        }
69
70        return (int)(((long) dp[m - 1][n - 1][0]
71                    + dp[m - 1][n - 1][1]) % MOD);
72    }
73}
74