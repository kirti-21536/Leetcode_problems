// Last updated: 10/8/2026, 11:03:23 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        Stack<Character> st=new Stack<>();
4        StringBuilder ans=new StringBuilder();
5        for(char ch:s.toCharArray()){
6            if(ch=='('){
7                if(!st.isEmpty()){
8                    ans.append(ch);
9                }
10                st.push(ch);
11            }
12            else{
13                char top=st.pop();
14                if(!st.isEmpty()){
15                    ans.append(ch);
16                }
17            }
18
19        }
20        return ans.toString();
21        
22    }
23}