// Last updated: 3/10/2026, 10:37:41 AM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int src, int dest) {
3        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
4        for(int i=0;i<n;i++){
5            graph.add(new ArrayList());
6        }
7        for(int arr[]:edges){
8            int u=arr[0];
9            int v=arr[1];
10            graph.get(u).add(v);
11            graph.get(v).add(u);
12        }
13        boolean visited[]=new boolean[n];
14        return dfs(graph,visited,src,dest);
15    }
16    public boolean dfs(ArrayList<ArrayList<Integer>> graph,boolean visited[],int src,
17    int dest){
18        visited[src]=true;
19        if(src==dest)return true;
20        for(int nbrs:graph.get(src)){
21            if(!visited[nbrs]){
22               if(dfs(graph,visited,nbrs,dest))return true;
23            }
24        }
25        return false;
26    }
27}