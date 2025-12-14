// Last updated: 12/14/2025, 8:47:33 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        if(num.length()==k)return "0";
4        if(k==0)return num;
5        Stack<Character> st=new Stack<>();
6
7        for(char ch:num.toCharArray()){
8            while(!st.isEmpty()&& k>0 && st.peek()>ch){
9                st.pop();
10                k--;
11            } 
12            st.push(ch);
13        }
14        while(k>0){
15            st.pop();
16            k--;
17        }
18
19        StringBuilder s=new StringBuilder();
20        for(char ch:st)s.append(ch);
21
22        while(s.length()>0 && s.charAt(0)=='0'){
23            s.deleteCharAt(0);
24        }
25        return s.length()==0?"0":s.toString();
26    }
27}