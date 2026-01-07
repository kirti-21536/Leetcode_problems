// Last updated: 1/8/2026, 1:23:53 AM
1class Solution {
2    long mod = 1000000007L;
3    Long[][] dp;
4    public int countHousePlacements(int n) {
5        dp = new Long[n][2];
6        long oneSide = solve(0, 0, n);
7        return (int)((oneSide * oneSide) % mod);
8    }
9    public long solve(int i, int last, int n) {
10        if (i == n) return 1;
11        if (dp[i][last] != null) return dp[i][last];
12
13        long ans = solve(i + 1, 0, n);   // place empty
14        if (last == 0) {
15            ans = (ans + solve(i + 1, 1, n)) % mod; // place house
16        }
17
18        return dp[i][last] = ans;
19    }
20}
21