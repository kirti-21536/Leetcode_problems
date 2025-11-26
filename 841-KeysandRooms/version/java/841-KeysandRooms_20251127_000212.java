// Last updated: 11/27/2025, 12:02:12 AM
1class Solution {
2    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
3        Queue<Integer> q=new LinkedList<>();
4        HashSet<Integer> visited=new HashSet<>();
5        q.add(0);
6        int c=0;
7        while(!q.isEmpty()){
8            //1.remove
9            int r=q.poll();
10            //2.ignore if already visited
11            if(visited.contains(r))continue;
12            //3.marked visited
13            visited.add(r);
14            //4.self work
15            c++;
16            //5.add unvisited nbrs
17            for(int nbrs:rooms.get(r)){
18               if(!visited.contains(nbrs)){
19                 q.add(nbrs);
20               }
21            }
22        }
23        return c==rooms.size();
24
25       
26    }
27}