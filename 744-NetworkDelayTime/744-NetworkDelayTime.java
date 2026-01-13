// Last updated: 1/13/2026, 11:14:16 AM
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] t : times) {
            int u = t[0], v = t[1], w = t[2];
            graph[u].add(new int[]{v, w});
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );
        pq.add(new int[]{0, k});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int time = cur[0];
            int node = cur[1];

            if (time > dist[node]) continue;

            for (int[] nbrs : graph[node]) {
                int nextNode = nbrs[0];
                int nextTime = nbrs[1];

                if (dist[nextNode] > time + nextTime) {
                    dist[nextNode] = time + nextTime;
                    pq.add(new int[]{dist[nextNode], nextNode});
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, dist[i]);
        }

        return ans;
    }
}
