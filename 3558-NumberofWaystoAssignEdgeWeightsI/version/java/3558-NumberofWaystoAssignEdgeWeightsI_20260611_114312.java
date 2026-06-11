// Last updated: 6/11/2026, 11:43:12 AM
1class Solution {
2    static final long MOD = 1_000_000_007L;
3
4    public int assignEdgeWeights(int[][] edges) {
5        int n = edges.length + 1;
6
7        List<Integer>[] graph = new ArrayList[n + 1];
8        for (int i = 0; i <= n; i++) {
9            graph[i] = new ArrayList<>();
10        }
11
12        for (int[] e : edges) {
13            int u = e[0];
14            int v = e[1];
15
16            graph[u].add(v);
17            graph[v].add(u);
18        }
19
20        Queue<Integer> q = new LinkedList<>();
21        boolean[] vis = new boolean[n + 1];
22
23        q.offer(1);
24        vis[1] = true;
25
26        int depth = -1;
27
28        while (!q.isEmpty()) {
29            int size = q.size();
30            depth++;
31
32            while (size-- > 0) {
33                int node = q.poll();
34
35                for (int nei : graph[node]) {
36                    if (!vis[nei]) {
37                        vis[nei] = true;
38                        q.offer(nei);
39                    }
40                }
41            }
42        }
43
44        return (int) modPow(2, depth - 1);
45    }
46
47    private long modPow(long a, long b) {
48        long res = 1;
49
50        while (b > 0) {
51            if ((b & 1) == 1) {
52                res = (res * a) % MOD;
53            }
54
55            a = (a * a) % MOD;
56            b >>= 1;
57        }
58
59        return res;
60    }
61}