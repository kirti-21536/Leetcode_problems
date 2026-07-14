// Last updated: 7/14/2026, 11:18:42 AM
1class Solution {
2    static final int MOD = 1_000_000_007;
3    public int subsequencePairCount(int[] nums) {
4        int MAX = 200;
5        long[][] dp = new long[MAX + 1][MAX + 1];
6        dp[0][0] = 1;
7
8        for (int x : nums) {
9            long[][] ndp = new long[MAX + 1][MAX + 1];
10
11            for (int g1 = 0; g1 <= MAX; g1++) {
12                for (int g2 = 0; g2 <= MAX; g2++) {
13                    long cur = dp[g1][g2];
14                    if (cur == 0) continue;
15
16                    // Skip
17                    ndp[g1][g2] = (ndp[g1][g2] + cur) % MOD;
18
19                    // Put into first subsequence
20                    int ng1 = (g1 == 0) ? x : gcd(g1, x);
21                    ndp[ng1][g2] = (ndp[ng1][g2] + cur) % MOD;
22
23                    // Put into second subsequence
24                    int ng2 = (g2 == 0) ? x : gcd(g2, x);
25                    ndp[g1][ng2] = (ndp[g1][ng2] + cur) % MOD;
26                }
27            }
28
29            dp = ndp;
30        }
31
32        long ans = 0;
33        for (int g = 1; g <= MAX; g++) {
34            ans = (ans + dp[g][g]) % MOD;
35        }
36
37        return (int) ans;
38    }
39
40    private int gcd(int a, int b) {
41        while (b != 0) {
42            int t = a % b;
43            a = b;
44            b = t;
45        }
46        return a;
47    }
48}