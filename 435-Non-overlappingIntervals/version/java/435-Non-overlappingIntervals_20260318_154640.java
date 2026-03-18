// Last updated: 3/18/2026, 3:46:40 PM
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        int n = graph.length;
4        
5        List<List<Integer>> rev = new ArrayList<>();
6        for (int i = 0; i < n; i++) {
7            rev.add(new ArrayList<>());
8        }
9        
10        int[] outdegree = new int[n];
11        
12        // Build reverse graph + outdegree
13        for (int i = 0; i < n; i++) {
14            outdegree[i] = graph[i].length;
15            for (int v : graph[i]) {
16                rev.get(v).add(i);
17            }
18        }
19        
20        Queue<Integer> q = new LinkedList<>();
21        
22        // Start from terminal nodes
23        for (int i = 0; i < n; i++) {
24            if (outdegree[i] == 0) {
25                q.offer(i);
26            }
27        }
28        
29        boolean[] safe = new boolean[n];
30        
31        while (!q.isEmpty()) {
32            int node = q.poll();
33            safe[node] = true;
34            
35            for (int prev : rev.get(node)) {
36                outdegree[prev]--;
37                if (outdegree[prev] == 0) {
38                    q.offer(prev);
39                }
40            }
41        }
42        
43        List<Integer> result = new ArrayList<>();
44        for (int i = 0; i < n; i++) {
45            if (safe[i]) result.add(i);
46        }
47        
48        return result;
49    }
50}