// Last updated: 3/10/2026, 12:09:22 PM
1class Solution {
2    public String reverseWords(String s) {
3        String ans[]=s.split("\s+");
4        String res="";
5        for(int i=ans.length-1;i>=0;i--){
6            res+=ans[i]+" ";
7        }
8        
9        return res.trim();
10    }
11}