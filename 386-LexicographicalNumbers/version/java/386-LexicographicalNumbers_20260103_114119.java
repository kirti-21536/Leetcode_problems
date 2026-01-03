// Last updated: 1/3/2026, 11:41:19 AM
1class Solution {
2    public List<Integer> lexicalOrder(int n) {
3     List<Integer> ll=new ArrayList<>();
4     lexico(n,0,ll);
5     ll.remove(0);
6     return ll;
7
8    }
9    public void lexico(int n,int curr,List<Integer> ll){
10        if(curr>n)return;
11        int i=0;
12        if(curr==0){
13            i=1;
14        }
15        if(curr<=n)ll.add(curr);
16        for(;i<=9;i++){
17            lexico(n,curr*10+i,ll);
18        }
19    }
20}