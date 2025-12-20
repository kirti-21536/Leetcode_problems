// Last updated: 12/20/2025, 11:56:30 PM
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(0);
        int c=0;
        while(!q.isEmpty()){
            //1.remove
            int r=q.poll();
            //2.ignore if already visited
            if(visited.contains(r))continue;
            //3.marked visited
            visited.add(r);
            //4.self work
            c++;
            //5.add unvisited nbrs
            for(int nbrs:rooms.get(r)){
               if(!visited.contains(nbrs)){
                 q.add(nbrs);
               }
            }
        }
        return c==rooms.size();

       
    }
}