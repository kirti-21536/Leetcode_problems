// Last updated: 9/27/2026, 5:58:42 PM
1class Solution {
2    public String reverseParentheses(String s) {
3        Stack<String> stack = new Stack<>();
4        StringBuilder curr = new StringBuilder();
5
6        for (char ch : s.toCharArray()) {
7
8            if (ch == '(') {
9                stack.push(curr.toString());
10                curr.setLength(0);
11
12            } else if (ch == ')') {
13                curr.reverse();
14
15                String prev = stack.pop();
16                curr = new StringBuilder(prev + curr);
17
18            } else {
19                curr.append(ch);
20            }
21        }
22
23        return curr.toString();
24    }
25}