// Last updated: 8/24/2026, 11:47:49 AM
1class Solution {
2    public int stoneGameVIII(int[] stones) {
3        int n = stones.length;
4        int[] prefix = new int[n];
5
6        prefix[0] = stones[0];
7
8        for (int i = 1; i < n; i++) {
9            prefix[i] = prefix[i - 1] + stones[i];
10        }
11
12        int ans = prefix[n - 1];
13
14        for (int i = n - 2; i >= 1; i--) {
15            ans = Math.max(ans, prefix[i] - ans);
16        }
17
18        return ans;
19    }
20}