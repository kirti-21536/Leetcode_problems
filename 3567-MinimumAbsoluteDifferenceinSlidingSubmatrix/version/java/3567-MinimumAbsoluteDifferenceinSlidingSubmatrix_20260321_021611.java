// Last updated: 3/21/2026, 2:16:11 AM
1import java.util.*;
2
3class Solution {
4    public int[][] minAbsDiff(int[][] grid, int k) {
5        int m = grid.length, n = grid[0].length;
6        int[][] ans = new int[m - k + 1][n - k + 1];
7
8        for (int i = 0; i <= m - k; i++) {
9            for (int j = 0; j <= n - k; j++) {
10
11                // Use TreeSet to keep distinct sorted values
12                TreeSet<Integer> set = new TreeSet<>();
13
14                for (int x = i; x < i + k; x++) {
15                    for (int y = j; y < j + k; y++) {
16                        set.add(grid[x][y]);
17                    }
18                }
19
20                // If only one distinct value
21                if (set.size() <= 1) {
22                    ans[i][j] = 0;
23                    continue;
24                }
25
26                int minDiff = Integer.MAX_VALUE;
27
28                Integer prev = null;
29                for (int val : set) {
30                    if (prev != null) {
31                        minDiff = Math.min(minDiff, val - prev);
32                    }
33                    prev = val;
34                }
35
36                ans[i][j] = minDiff;
37            }
38        }
39
40        return ans;
41    }
42}