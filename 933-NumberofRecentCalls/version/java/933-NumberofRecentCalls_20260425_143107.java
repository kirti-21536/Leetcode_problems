// Last updated: 4/25/2026, 2:31:07 PM
1class RecentCounter {
2    private Queue<Integer> q;
3    public RecentCounter() {
4        q=new LinkedList<>();
5
6    }
7    
8    public int ping(int t) {
9        q.add(t);
10        while(q.peek()<t-3000){
11            q.poll();
12        }
13        return q.size();
14    }
15}
16
17/**
18 * Your RecentCounter object will be instantiated and called as such:
19 * RecentCounter obj = new RecentCounter();
20 * int param_1 = obj.ping(t);
21 */