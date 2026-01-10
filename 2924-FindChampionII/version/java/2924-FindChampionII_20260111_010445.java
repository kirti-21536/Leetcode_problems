// Last updated: 1/11/2026, 1:04:45 AM
1class Solution {
2    public int findChampion(int n, int[][] edges) {
3        int[] indeg = new int[n];
4        for (int i = 0; i < edges.length; i++) {
5            int lose = edges[i][1];
6            indeg[lose]++;
7        }
8        int ans = -1;
9        for (int i = 0; i < n; i++) {
10            if (indeg[i] == 0) {
11                if (ans != -1) return -1;
12                ans = i;
13            }
14        }
15        return ans;
16    }
17}
18