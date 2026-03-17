// Last updated: 3/17/2026, 11:14:56 AM
1class Solution {
2    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
3        int n=graph.length;
4        boolean vis[]=new boolean[n];
5        List<List<Integer>> ans=new ArrayList<>();
6        List<Integer> ll=new ArrayList<>();
7        ll.add(0);
8        vis[0]=true; 
9        dfs(graph,0,n-1,vis,ll,ans);  
10        return ans;     
11    }
12    public void dfs(int [][]graph,int src,int target,boolean vis[],List<Integer> ll,List<List<Integer>> ans){
13        if(src==target){
14            ans.add(new ArrayList<>(ll));
15            return;
16        }
17        
18        for(int nbrs:graph[src]){
19            if(!vis[nbrs]){
20                ll.add(nbrs);
21                vis[nbrs]=true;
22                dfs(graph,nbrs,target,vis,ll,ans);
23                ll.remove(ll.size()-1);
24                vis[nbrs]=false;
25            }
26        }
27    }
28}