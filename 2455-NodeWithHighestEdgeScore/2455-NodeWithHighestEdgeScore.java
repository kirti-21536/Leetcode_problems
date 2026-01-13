// Last updated: 1/13/2026, 11:11:14 AM
class Solution {
    public int edgeScore(int[] edges) {

        long[] score = new long[edges.length];
        for (int i = 0; i < edges.length; i++) {
            score[edges[i]] += i;
        }
        long max = -1;
        int ans = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
                ans = i;
            }
        }
        return ans;
    }
}
