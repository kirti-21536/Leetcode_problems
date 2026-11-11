// Last updated: 11/11/2026, 8:27:45 PM
1class Solution {
2    public long minimumCost(int cost1, int cost2, int costBoth,
3                            int need1, int need2) {
4
5        long a = (long) need1 * cost1 +
6                 (long) need2 * cost2;
7
8        long b = (long) Math.max(need1, need2) * costBoth;
9
10        int mn = Math.min(need1, need2);
11
12        long c = (long) mn * costBoth +
13                 (long) (need1 - mn) * cost1 +
14                 (long) (need2 - mn) * cost2;
15
16        return Math.min(a, Math.min(b, c));
17    }
18}
19