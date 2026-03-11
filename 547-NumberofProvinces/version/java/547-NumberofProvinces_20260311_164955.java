// Last updated: 3/11/2026, 4:49:55 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n=isConnected.length;
4        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
5        for(int i=0;i<=isConnected.length;i++){
6            graph.add(new ArrayList());
7        }
8        for(int i=0;i<isConnected.length;i++){
9            for(int j=0;j<isConnected[0].length;j++){
10                if(isConnected[i][j]==1){
11                    graph.get(i+1).add(j+1);
12                    graph.get(j+1).add(i+1);
13                }
14            }
15        }
16        int count=0;
17        boolean visited[]=new boolean[n+1];
18        for(int i=1;i<=n;i++){
19             if(!visited[i]){
20                dfs(graph,i,visited);
21                count++;
22             }
23            
24        }
25        return count;
26    }
27    public static void dfs(ArrayList<ArrayList<Integer>> graph,int src,boolean visited[]){
28        if(visited[src])return;
29        visited[src]=true;
30        for(int nbrs:graph.get(src)){
31            if(!visited[nbrs]){
32                dfs(graph,nbrs,visited);
33            }
34        }
35    }
36}