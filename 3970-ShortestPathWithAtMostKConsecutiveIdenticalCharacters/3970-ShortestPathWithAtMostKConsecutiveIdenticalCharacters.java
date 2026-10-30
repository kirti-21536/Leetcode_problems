// Last updated: 10/30/2026, 9:25:34 PM
1class Solution {
2    public int shortestPath(int n, int[][] edges, String labels, int k) {
3
4        List<int[]>[] graph = new ArrayList[n];
5
6        for (int i = 0; i < n; i++) {
7            graph[i] = new ArrayList<>();
8        }
9
10        for (int[] e : edges) {
11            graph[e[0]].add(new int[]{e[1], e[2]});
12        }
13
14        long[][] dist = new long[n][k + 1];
15
16        for (long[] row : dist) {
17            Arrays.fill(row, Long.MAX_VALUE);
18        }
19
20        // {cost, node, consecutive count}
21        PriorityQueue<long[]> pq = new PriorityQueue<>(
22            (a, b) -> Long.compare(a[0], b[0])
23        );
24
25        dist[0][1] = 0;
26        pq.offer(new long[]{0, 0, 1});
27
28        while (!pq.isEmpty()) {
29
30            long[] curr = pq.poll();
31
32            long cost = curr[0];
33            int node = (int) curr[1];
34            int count = (int) curr[2];
35
36            // Ignore outdated states
37            if (cost != dist[node][count]) {
38                continue;
39            }
40
41            // Destination reached
42            if (node == n - 1) {
43                return (int) cost;
44            }
45
46            for (int[] next : graph[node]) {
47
48                int v = next[0];
49                int weight = next[1];
50
51                int newCount;
52
53                if (labels.charAt(node) == labels.charAt(v)) {
54                    newCount = count + 1;
55                } else {
56                    newCount = 1;
57                }
58
59                // Invalid consecutive sequence
60                if (newCount > k) {
61                    continue;
62                }
63
64                long newCost = cost + weight;
65
66                if (newCost < dist[v][newCount]) {
67
68                    dist[v][newCount] = newCost;
69
70                    pq.offer(new long[]{
71                        newCost, v, newCount
72                    });
73                }
74            }
75        }
76
77        return -1;
78    }
79}
80