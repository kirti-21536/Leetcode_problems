// Last updated: 6/25/2026, 12:32:43 AM
1class Solution {
2    static final int MOD = 1_000_000_007;
3
4    public int zigZagArrays(int n, int l, int r) {
5        int m = r - l + 1;
6        int size = 2 * m;
7
8        long[] base = new long[size];
9
10        // Base for length = 2
11        for (int i = 0; i < m; i++) {
12            base[i] = i;               // up[i]
13            base[m + i] = m - 1 - i;   // down[i]
14        }
15
16        if (n == 2) {
17            long ans = 0;
18            for (long x : base) ans = (ans + x) % MOD;
19            return (int) ans;
20        }
21
22        long[][] trans = new long[size][size];
23
24        // newUp[i] = sum of down[j] where j < i
25        for (int i = 0; i < m; i++) {
26            for (int j = 0; j < i; j++) {
27                trans[i][m + j] = 1;
28            }
29        }
30
31        // newDown[i] = sum of up[j] where j > i
32        for (int i = 0; i < m; i++) {
33            for (int j = i + 1; j < m; j++) {
34                trans[m + i][j] = 1;
35            }
36        }
37
38        long[][] power = matrixPower(trans, n - 2);
39        long[] result = multiply(power, base);
40
41        long ans = 0;
42        for (long val : result) ans = (ans + val) % MOD;
43
44        return (int) ans;
45    }
46
47    private long[][] matrixPower(long[][] mat, int exp) {
48        int n = mat.length;
49        long[][] result = new long[n][n];
50
51        for (int i = 0; i < n; i++) result[i][i] = 1;
52
53        while (exp > 0) {
54            if ((exp & 1) == 1) result = multiply(result, mat);
55            mat = multiply(mat, mat);
56            exp >>= 1;
57        }
58        return result;
59    }
60
61    private long[][] multiply(long[][] A, long[][] B) {
62        int n = A.length;
63        long[][] C = new long[n][n];
64
65        for (int i = 0; i < n; i++) {
66            for (int k = 0; k < n; k++) {
67                if (A[i][k] == 0) continue;
68                for (int j = 0; j < n; j++) {
69                    if (B[k][j] == 0) continue;
70                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
71                }
72            }
73        }
74        return C;
75    }
76
77    private long[] multiply(long[][] A, long[] v) {
78        int n = A.length;
79        long[] res = new long[n];
80
81        for (int i = 0; i < n; i++) {
82            for (int j = 0; j < n; j++) {
83                if (A[i][j] == 0) continue;
84                res[i] = (res[i] + A[i][j] * v[j]) % MOD;
85            }
86        }
87        return res;
88    }
89}