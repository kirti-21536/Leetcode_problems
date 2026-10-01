// Last updated: 10/1/2026, 12:19:50 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st=new Stack<>();
4        for(char ch:s.toCharArray()){
5            if(ch=='('||ch=='{'||ch=='['){
6                st.push(ch);
7            }
8            else {
9                if(st.isEmpty())return false;
10                if((ch=='}'&& st.peek()=='{')||(ch==')'&&st.peek()=='(') ||(ch==']'&& st.peek()=='[')){
11                    st.pop();
12                }
13                else{
14                    return false;
15                }
16            }
17        }
18            return st.isEmpty();
19        
20    }
21}