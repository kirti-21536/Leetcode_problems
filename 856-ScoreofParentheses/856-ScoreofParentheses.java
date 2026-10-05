// Last updated: 10/5/2026, 11:34:19 AM
1class Solution {
2    public int scoreOfParentheses(String s) {
3        Stack<Integer> st=new Stack<>(); // score for each level
4        st.push(0);
5        for(char ch:s.toCharArray()){
6            int contri=0;
7            if(ch=='('){
8                st.push(0);
9            }
10            else{
11                int inner_score=st.pop();
12                if(inner_score==0){
13                    contri=1;
14                }
15                else{
16                    contri=2*inner_score;
17                }
18            }
19            st.push(contri+st.pop());
20        }
21    return st.pop();
22    }
23}