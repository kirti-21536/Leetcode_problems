// Last updated: 1/3/2026, 12:26:25 PM
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> ll=new ArrayList<>();
4        int open=0;
5        int close=0;
6        String ans="";
7        solve(n,ll,open,close,ans);
8        return ll;
9    }
10    public void solve(int n,List<String> ll,int open,int close,String ans){
11        if(open==n && close ==n){
12            ll.add(ans);
13            return;
14        }
15        if(open>n ||close>n || close>open){
16            return;
17        }
18        solve(n,ll,open+1,close,ans+"(");
19        solve(n,ll,open,close+1,ans+")");
20    }
21}