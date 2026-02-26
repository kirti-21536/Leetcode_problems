// Last updated: 2/26/2026, 10:53:38 AM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
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
14        return dfs(graph,visited,source,destination);
15}   
16    public boolean dfs(ArrayList<ArrayList<Integer>> graph,boolean[] visited,int src,int dest){
17        visited[src]=true;
18        if(src==dest)return true;
19        for(int nbrs:graph.get(src)){
20            if(!visited[nbrs]){
21                if(dfs(graph, visited, nbrs, dest)) {
22                    return true;
23                }
24            }
25        }
26        return false;
27    }
28}