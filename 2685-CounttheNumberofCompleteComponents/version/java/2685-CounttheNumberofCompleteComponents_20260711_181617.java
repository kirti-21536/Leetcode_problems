// Last updated: 7/11/2026, 6:16:17 PM
1class Solution {
2    public int countCompleteComponents(int n, int[][] edges) {
3        List<Integer>[] graph = new ArrayList[n];
4        for (int i = 0; i < n; i++) {
5            graph[i] = new ArrayList<>();
6        }
7
8        for (int[] e : edges) {
9            graph[e[0]].add(e[1]);
10            graph[e[1]].add(e[0]);
11        }
12
13        boolean[] visited = new boolean[n];
14        int ans = 0;
15
16        for (int i = 0; i < n; i++) {
17            if (!visited[i]) {
18                int[] res = dfs(i, graph, visited);
19                int nodes = res[0];
20                int degreeSum = res[1];
21                int edgeCount = degreeSum / 2;
22
23                if (edgeCount == nodes * (nodes - 1) / 2) {
24                    ans++;
25                }
26            }
27        }
28
29        return ans;
30    }
31
32    private int[] dfs(int node, List<Integer>[] graph, boolean[] visited) {
33        visited[node] = true;
34
35        int nodes = 1;
36        int degreeSum = graph[node].size();
37
38        for (int nei : graph[node]) {
39            if (!visited[nei]) {
40                int[] res = dfs(nei, graph, visited);
41                nodes += res[0];
42                degreeSum += res[1];
43            }
44        }
45
46        return new int[]{nodes, degreeSum};
47    }
48}