// Last updated: 7/3/2026, 9:09:47 AM
1class Solution {
2    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
3        int n = online.length;
4        List<int[]>[] graph = new ArrayList[n];
5        int[] indegree = new int[n];
6
7        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
8
9        int maxCost = 0;
10        for (int[] e : edges) {
11            graph[e[0]].add(new int[]{e[1], e[2]});
12            indegree[e[1]]++;
13            maxCost = Math.max(maxCost, e[2]);
14        }
15
16        // Topological order
17        Queue<Integer> q = new LinkedList<>();
18        int[] temp = indegree.clone();
19
20        for (int i = 0; i < n; i++) {
21            if (temp[i] == 0) q.offer(i);
22        }
23
24        List<Integer> topo = new ArrayList<>();
25        while (!q.isEmpty()) {
26            int u = q.poll();
27            topo.add(u);
28            for (int[] nei : graph[u]) {
29                if (--temp[nei[0]] == 0) q.offer(nei[0]);
30            }
31        }
32
33        int low = 0, high = maxCost, ans = -1;
34
35        while (low <= high) {
36            int mid = low + (high - low) / 2;
37            if (check(mid, graph, topo, online, k, n)) {
38                ans = mid;
39                low = mid + 1;
40            } else {
41                high = mid - 1;
42            }
43        }
44
45        return ans;
46    }
47
48    private boolean check(int limit, List<int[]>[] graph, List<Integer> topo,
49                          boolean[] online, long k, int n) {
50
51        long INF = Long.MAX_VALUE / 4;
52        long[] dist = new long[n];
53        Arrays.fill(dist, INF);
54        dist[0] = 0;
55
56        for (int u : topo) {
57            if (dist[u] == INF) continue;
58
59            for (int[] edge : graph[u]) {
60                int v = edge[0], cost = edge[1];
61
62                if (cost < limit) continue;
63                if (v != n - 1 && !online[v]) continue;
64
65                dist[v] = Math.min(dist[v], dist[u] + cost);
66            }
67        }
68
69        return dist[n - 1] <= k;
70    }
71}