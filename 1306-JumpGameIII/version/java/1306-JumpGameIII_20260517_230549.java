// Last updated: 5/17/2026, 11:05:49 PM
1class Solution {
2    public boolean canReach(int[] arr, int start) {
3        boolean[] vis = new boolean[arr.length];
4        return dfs(arr, start, vis);
5    }
6
7    private boolean dfs(int[] arr, int i, boolean[] vis) {
8        
9        // out of bounds
10        if (i < 0 || i >= arr.length) {
11            return false;
12        }
13
14        // already visited
15        if (vis[i]) {
16            return false;
17        }
18
19        // found 0
20        if (arr[i] == 0) {
21            return true;
22        }
23
24        vis[i] = true;
25        return dfs(arr, i + arr[i], vis)||dfs(arr, i - arr[i], vis);
26    }
27}