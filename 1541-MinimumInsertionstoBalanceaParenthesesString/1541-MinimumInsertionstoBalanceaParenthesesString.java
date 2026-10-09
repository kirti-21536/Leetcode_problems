// Last updated: 10/9/2026, 11:35:30 PM
1class Solution {
2    public int minInsertions(String s) {
3        Stack<Character> st = new Stack<>();
4        int count = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7            char ch = s.charAt(i);
8
9            if (ch == '(') {
10                st.push(ch);
11            } else {
12                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
13                    if (!st.isEmpty()) {
14                        st.pop();
15                    } else {
16                        count++;
17                    }
18                    i++;
19                } else {
20                    if (!st.isEmpty()) {
21                        st.pop();
22                        count++;
23                    } else {
24                        count += 2;
25                    }
26                }
27            }
28        }
29
30        count += st.size() * 2;
31        return count;
32    }
33}