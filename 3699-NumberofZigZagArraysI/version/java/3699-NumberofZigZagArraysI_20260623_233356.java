// Last updated: 6/23/2026, 11:33:56 PM
1class Solution {
2    static final int MOD = 1_000_000_007;
3
4    public int zigZagArrays(int n, int l, int r) {
5        int m = r - l + 1;
6
7        // Base: length = 2
8        long[] up = new long[m];    // ended with increase
9        long[] down = new long[m];  // ended with decrease
10
11        // Build all pairs
12        for (int a = 0; a < m; a++) {
13            up[a] = a;               // smaller values before it
14            down[a] = m - 1 - a;     // larger values before it
15        }
16
17        // Extend from length 3 to n
18        for (int len = 3; len <= n; len++) {
19            long[] newUp = new long[m];
20            long[] newDown = new long[m];
21
22            // Prefix sum for down
23            long prefix = 0;
24            for (int i = 0; i < m; i++) {
25                newUp[i] = prefix;
26                prefix = (prefix + down[i]) % MOD;
27            }
28
29            // Suffix sum for up
30            long suffix = 0;
31            for (int i = m - 1; i >= 0; i--) {
32                newDown[i] = suffix;
33                suffix = (suffix + up[i]) % MOD;
34            }
35
36            up = newUp;
37            down = newDown;
38        }
39
40        long ans = 0;
41        for (int i = 0; i < m; i++) {
42            ans = (ans + up[i] + down[i]) % MOD;
43        }
44
45        return (int) ans;
46    }
47}