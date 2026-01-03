// Last updated: 1/3/2026, 1:24:33 PM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        String keys[]={" ","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
4        int i=0;
5        List<String> ll=new ArrayList<>();
6        String ans="";
7        solve(keys,digits,i,ans,ll);  
8        return ll;  
9    }
10    public void solve(String[] keys,String digits,int i,String ans,List<String> ll){
11        if(i==digits.length()){
12             ll.add(ans);
13            return;
14        }
15        for(char ch:keys[digits.charAt(i)-'0'].toCharArray()){
16            solve(keys,digits,i+1,ans+ch,ll);
17        }
18    }
19}