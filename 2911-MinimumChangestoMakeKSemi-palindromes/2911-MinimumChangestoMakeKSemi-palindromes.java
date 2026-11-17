// Last updated: 11/17/2026, 10:26:48 PM
1class Solution {
2    public int minimumChanges(String s, int k) {
3        int n = s.length();
4
5        List<Integer>[] factors = new ArrayList[n + 1];
6
7        for (int i = 1; i <= n; i++) {
8            factors[i] = new ArrayList<>();
9        }
10
11        for (int d = 1; d < n; d++) {
12            for (int i = d * 2; i <= n; i += d) {
13                factors[i].add(d);
14            }
15        }
16
17        int[][] cost = new int[n][n];
18
19        for (int i = 0; i < n; i++) {
20            for (int j = i + 1; j < n; j++) {
21                int len = j - i + 1;
22                int minCost = n;
23
24                for (int d : factors[len]) {
25                    int changes = 0;
26
27                    for (int offset = 0; offset < d; offset++) {
28                        int l = i + offset;
29                        int r = j - d + 1 + offset;
30
31                        while (l < r) {
32                            if (s.charAt(l) != s.charAt(r)) {
33                                changes++;
34                            }
35
36                            l += d;
37                            r -= d;
38                        }
39                    }
40
41                    minCost = Math.min(minCost, changes);
42                }
43
44                cost[i][j] = minCost;
45            }
46        }
47
48        int[][] dp = new int[n + 1][k + 1];
49
50        for (int[] row : dp) {
51            Arrays.fill(row, n);
52        }
53
54        dp[n][0] = 0;
55
56        for (int i = n - 1; i >= 0; i--) {
57            for (int j = 1; j <= k; j++) {
58                for (int l = i + 1; l < n; l++) {
59                    dp[i][j] = Math.min(
60                        dp[i][j],
61                        cost[i][l] + dp[l + 1][j - 1]
62                    );
63                }
64            }
65        }
66
67        return dp[0][k];
68    }
69}
70