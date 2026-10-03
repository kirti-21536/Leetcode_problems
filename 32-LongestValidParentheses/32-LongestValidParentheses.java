// Last updated: 10/3/2026, 12:39:58 PM
1class Solution {
2    public int longestValidParentheses(String s) {
3        Stack<Integer> st = new Stack<>();
4        st.push(-1);
5
6        int max = 0;
7
8        for (int i = 0; i < s.length(); i++) {
9
10            if (s.charAt(i) == '(') {
11                st.push(i);
12            } 
13            else {
14                st.pop();
15
16                if (st.isEmpty()) {
17                    st.push(i);
18                } 
19                else {
20                    max = Math.max(max, i - st.peek());
21                }
22            }
23        }
24
25        return max;
26    }
27}