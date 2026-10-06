// Last updated: 10/6/2026, 11:09:57 AM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        Stack<Character> st=new Stack<>();
4        int count=0; //valid parentheses count
5        for(char ch:s.toCharArray()){
6            if(ch=='('){
7                st.push(ch);
8            }
9            else{
10                if(!st.isEmpty() && (st.peek()=='(' && ch==')')){
11                    st.pop();
12                    count++;
13                }
14            }
15        }
16        return s.length()-2*count; 
17        
18    }
19}