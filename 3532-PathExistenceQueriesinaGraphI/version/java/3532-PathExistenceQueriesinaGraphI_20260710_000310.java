// Last updated: 7/10/2026, 12:03:10 AM
1class Solution {
2    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
3        int[] group = new int[n];
4        int component = 0;
5
6        for (int i = 1; i < n; i++) {
7            if (nums[i] - nums[i - 1] > maxDiff) {
8                component++;
9            }
10            group[i] = component;
11        }
12
13        boolean[] ans = new boolean[queries.length];
14
15        for (int i = 0; i < queries.length; i++) {
16            ans[i] = group[queries[i][0]] == group[queries[i][1]];
17        }
18
19        return ans;
20    }
21}