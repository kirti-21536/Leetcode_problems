// Last updated: 3/19/2026, 10:57:01 AM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> ll=new ArrayList<>();
4        String ans="";
5        int open=0;
6        int close=0;
7        generate(n,ans,open,close,ll);
8        return ll;
9    }
10    public void generate(int n,String ans,int open ,int close,List<String> ll){
11        if(open==n && close==n){
12            ll.add(ans);
13            return;
14        }
15        if(open<n)generate(n,ans+"(",open+1,close,ll);
16        if(open>close){
17            generate(n,ans+")",open ,close+1,ll);
18        }
19    }
20}