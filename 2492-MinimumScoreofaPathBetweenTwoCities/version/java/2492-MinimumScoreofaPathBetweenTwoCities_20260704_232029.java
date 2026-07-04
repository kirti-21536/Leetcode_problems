// Last updated: 7/4/2026, 11:20:29 PM
1class Solution {
2    int ans = Integer.MAX_VALUE;
3    public int minScore(int n, int[][] roads) {
4        List<int[]>[] graph = new ArrayList[n + 1];
5        for (int i = 1; i <= n; i++) {
6            graph[i] = new ArrayList<>();
7        }
8        for (int[] road : roads) {
9            graph[road[0]].add(new int[]{road[1], road[2]});
10            graph[road[1]].add(new int[]{road[0], road[2]});
11        }
12        boolean[] visited = new boolean[n + 1];
13        dfs(1, graph, visited);
14        return ans;
15    }
16
17    private void dfs(int node, List<int[]>[] graph, boolean[] visited) {
18        visited[node] = true;
19        for (int[] nei : graph[node]) {
20            ans = Math.min(ans, nei[1]);
21            if (!visited[nei[0]]) {
22                dfs(nei[0], graph, visited);
23            }
24        }
25    }
26}