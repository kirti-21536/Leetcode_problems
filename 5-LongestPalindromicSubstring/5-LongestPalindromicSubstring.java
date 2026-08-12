// Last updated: 8/12/2026, 2:57:33 PM
1class Solution {
2    List<Integer>[] graph;
3    int[] count;
4    int[] ans;
5
6    public int[] sumOfDistancesInTree(int n, int[][] edges) {
7        graph = new ArrayList[n];
8        count = new int[n];
9        ans = new int[n];
10
11        for (int i = 0; i < n; i++) {
12            graph[i] = new ArrayList<>();
13            count[i] = 1;
14        }
15
16        for (int[] edge : edges) {
17            graph[edge[0]].add(edge[1]);
18            graph[edge[1]].add(edge[0]);
19        }
20
21        dfs1(0, -1);
22        dfs2(0, -1, n);
23
24        return ans;
25    }
26
27    private void dfs1(int node, int parent) {
28        for (int child : graph[node]) {
29            if (child == parent) continue;
30
31            dfs1(child, node);
32
33            count[node] += count[child];
34            ans[node] += ans[child] + count[child];
35        }
36    }
37
38    private void dfs2(int node, int parent, int n) {
39        for (int child : graph[node]) {
40            if (child == parent) continue;
41
42            ans[child] = ans[node] - count[child]
43                    + (n - count[child]);
44
45            dfs2(child, node, n);
46        }
47    }
48}