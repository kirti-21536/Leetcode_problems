// Last updated: 3/17/2026, 12:34:40 PM
1class Solution {
2    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
3        
4        List<List<double[]>> graph = new ArrayList<>();
5        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
6
7        for(int i=0;i<edges.length;i++){
8            int u = edges[i][0];
9            int v = edges[i][1];
10            double p = succProb[i];
11
12            graph.get(u).add(new double[]{v,p});
13            graph.get(v).add(new double[]{u,p});
14        }
15
16        double[] prob = new double[n];
17        prob[start] = 1.0;
18
19        PriorityQueue<double[]> pq =
20            new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
21
22        pq.add(new double[]{1.0,start});
23
24        while(!pq.isEmpty()){
25
26            double[] cur = pq.poll();
27            double currProb = cur[0];
28            int node = (int)cur[1];
29
30            if(node == end) return currProb;
31
32            for(double[] nei : graph.get(node)){
33                int next = (int)nei[0];
34                double edgeProb = nei[1];
35
36                double newProb = currProb * edgeProb;
37
38                if(newProb > prob[next]){
39                    prob[next] = newProb;
40                    pq.add(new double[]{newProb,next});
41                }
42            }
43        }
44
45        return 0.0;
46    }
47}