// Last updated: 3/23/2026, 12:24:16 AM
1class Solution {
2    public boolean findRotation(int[][] mat, int[][] target) {
3        int n = mat.length;
4        boolean is0 = true;
5        boolean is90 = true;
6        boolean is180 = true;
7        boolean is270 = true;
8
9        for (int i = 0; i < n; i++) {
10            for (int j = 0; j < n; j++) {
11
12                if (mat[i][j] != target[i][j])
13                    is0 = false;
14
15                if (mat[i][j] != target[j][n - 1 - i])
16                    is90 = false;
17
18                if (mat[i][j] != target[n - 1 - i][n - 1 - j])
19                    is180 = false;
20
21                if (mat[i][j] != target[n - 1 - j][i])
22                    is270 = false;
23            }
24        }
25
26        return is0 || is90 || is180 || is270;
27    }
28}