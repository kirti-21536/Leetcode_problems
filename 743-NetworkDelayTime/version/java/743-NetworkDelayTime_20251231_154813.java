// Last updated: 12/31/2025, 3:48:13 PM
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        List<int[]>[] graph = new ArrayList[n + 1];
4        for (int i = 1; i <= n; i++) {
5            graph[i] = new ArrayList<>();
6        }
7
8        for (int[] t : times) {
9            int u = t[0], v = t[1], w = t[2];
10            graph[u].add(new int[]{v, w});
11        }
12
13        int[] dist = new int[n + 1];
14        Arrays.fill(dist, Integer.MAX_VALUE);
15        dist[k] = 0;
16
17        PriorityQueue<int[]> pq = new PriorityQueue<>(
18            (a, b) -> a[0] - b[0]
19        );
20        pq.add(new int[]{0, k});
21        while (!pq.isEmpty()) {
22            int[] cur = pq.poll();
23            int time = cur[0];
24            int node = cur[1];
25
26            if (time > dist[node]) continue;
27
28            for (int[] nbrs : graph[node]) {
29                int nextNode = nbrs[0];
30                int nextTime = nbrs[1];
31
32                if (dist[nextNode] > time + nextTime) {
33                    dist[nextNode] = time + nextTime;
34                    pq.add(new int[]{dist[nextNode], nextNode});
35                }
36            }
37        }
38        int ans = 0;
39        for (int i = 1; i <= n; i++) {
40            if (dist[i] == Integer.MAX_VALUE) return -1;
41            ans = Math.max(ans, dist[i]);
42        }
43
44        return ans;
45    }
46}
47