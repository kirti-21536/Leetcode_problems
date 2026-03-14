// Last updated: 3/14/2026, 11:14:24 AM
1class Solution {
2    public String getHappyString(int n, int k) {
3        ArrayList<String> ll=new ArrayList<>();
4        
5        solve(n,"",ll);
6        System.out.println(ll);
7        return ll.size()<k?"":ll.get(k-1);
8    }
9    public void solve(int n,String ans,ArrayList<String> ll){
10        if(n==0){
11            ll.add(ans);
12            return;
13        }
14        if(ans.length()==0 || ans.charAt(ans.length()-1)!='a')solve(n-1,ans+"a",ll);
15        if(ans.length()==0 || ans.charAt(ans.length()-1)!='b')solve(n-1,ans+"b",ll);
16        if(ans.length()==0 || ans.charAt(ans.length()-1)!='c')solve(n-1,ans+"c",ll);
17    }
18}