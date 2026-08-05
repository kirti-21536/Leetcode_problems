// Last updated: 8/5/2026, 11:25:14 PM
1class Solution {
2    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
3        List<Integer>[] graph = new ArrayList[n];
4        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
5        for (int[] e : invocations) {
6            graph[e[0]].add(e[1]);
7        }
8        boolean[] suspicious = new boolean[n];
9        dfs(k, graph, suspicious);
10        // If any non-suspicious method calls a suspicious one,
11        // nothing can be removed.
12        for (int[] e : invocations) {
13            if (!suspicious[e[0]] && suspicious[e[1]]) {
14                List<Integer> ans = new ArrayList<>();
15                for (int i = 0; i < n; i++) ans.add(i);
16                return ans;
17            }
18        }
19        List<Integer> ans = new ArrayList<>();
20        for (int i = 0; i < n; i++) {
21            if (!suspicious[i]) ans.add(i);
22        }
23        return ans;
24    }
25
26    private void dfs(int u, List<Integer>[] graph, boolean[] suspicious) {
27        suspicious[u] = true;
28        for (int v : graph[u]) {
29            if (!suspicious[v]) {
30                dfs(v, graph, suspicious);
31            }
32        }
33    }
34}