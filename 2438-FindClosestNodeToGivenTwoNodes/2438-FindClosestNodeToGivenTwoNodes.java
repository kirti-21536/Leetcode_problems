// Last updated: 1/30/2026, 12:26:05 PM
class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;

        int[] dist1 = getDistances(edges, node1);
        int[] dist2 = getDistances(edges, node2);
        int ans = -1;
        int best = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (dist1[i] != -1 && dist2[i] != -1) {
                int cur = Math.max(dist1[i], dist2[i]);
                if (cur < best) {
                    best = cur;
                    ans = i;
                }
            }
        }
        return ans;
    }

    public int[] getDistances(int[] edges, int start) {
        int n = edges.length;
        int[] dist = new int[n];
        Arrays.fill(dist, -1);

        int curr = start;
        int d = 0;

        while (curr != -1 && dist[curr] == -1) {
            dist[curr] = d++;
            curr = edges[curr];
        }
        return dist;
    }
}
