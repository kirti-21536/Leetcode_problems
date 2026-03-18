// Last updated: 3/18/2026, 3:05:13 PM
1class Solution {
2    public int[] findRedundantConnection(int[][] edges) {
3        int n = edges.length;
4        
5        int[] parent = new int[n + 1];
6        
7        // Initialize parent
8        for (int i = 1; i <= n; i++) {
9            parent[i] = i;
10        }
11        
12        for (int[] edge : edges) {
13            int u = edge[0];
14            int v = edge[1];
15            
16            int pu = find(parent, u);
17            int pv = find(parent, v);
18            
19            // If same parent → cycle
20            if (pu == pv) {
21                return edge;
22            }
23            
24            // Union
25            parent[pu] = pv;
26        }
27        
28        return new int[]{};
29    }
30    
31    public int find(int[] parent, int x) {
32        if (parent[x] != x) {
33            parent[x] = find(parent, parent[x]); // path compression
34        }
35        return parent[x];
36    }
37}