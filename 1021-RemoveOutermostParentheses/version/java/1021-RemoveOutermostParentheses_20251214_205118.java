// Last updated: 12/14/2025, 8:51:18 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder sb = new StringBuilder();
4        int depth = 0;
5
6        for (char ch : s.toCharArray()) {
7            if (ch == '(') {
8                if (depth > 0) sb.append(ch);
9                depth++;
10            } else {
11                depth--;
12                if (depth > 0) sb.append(ch);
13            }
14        }
15        return sb.toString();
16    }
17}
18