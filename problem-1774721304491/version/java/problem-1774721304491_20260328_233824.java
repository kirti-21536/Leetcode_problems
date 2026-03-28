// Last updated: 3/28/2026, 11:38:24 PM
1class Solution {
2    public int minCost(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        HashSet<Integer>[][] dp = new HashSet[m][n];
7
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                dp[i][j] = new HashSet<>();
11            }
12        }
13
14        dp[0][0].add(grid[0][0]);
15
16        for (int i = 0; i < m; i++) {
17            for (int j = 0; j < n; j++) {
18
19                if (i > 0) {
20                    for (int val : dp[i - 1][j]) {
21                        dp[i][j].add(val ^ grid[i][j]);
22                    }
23                }
24
25                if (j > 0) {
26                    for (int val : dp[i][j - 1]) {
27                        dp[i][j].add(val ^ grid[i][j]);
28                    }
29                }
30            }
31        }
32        int ans = Integer.MAX_VALUE;
33        for (int val : dp[m - 1][n - 1]) {
34            ans = Math.min(ans, val);
35        }
36
37        return ans;
38        
39    }
40}