// Last updated: 1/13/2026, 11:11:05 AM
class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] indeg = new int[n];
        for (int i = 0; i < edges.length; i++) {
            int lose = edges[i][1];
            indeg[lose]++;
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (indeg[i] == 0) {
                if (ans != -1) return -1;
                ans = i;
            }
        }
        return ans;
    }
}
