// Last updated: 12/8/2025, 10:31:59 PM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> stack = new Stack<>();
4        int num = 0;
5        char op = '+';
6        for (int i = 0; i < s.length(); i++) {
7            char ch = s.charAt(i);
8            if (Character.isDigit(ch)) {
9                num = num * 10 + (ch - '0');  
10            }
11
12            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
13                if (op == '+') {
14                    stack.push(num);
15                } else if (op == '-') {
16                    stack.push(-num);
17                } else if (op == '*') {
18                    stack.push(stack.pop() * num);
19                } else if (op == '/') {
20                    stack.push(stack.pop() / num);
21                }
22
23                op = ch;
24                num = 0;
25            }
26        }
27
28        int result = 0;
29        for (int val : stack) {
30            result += val;
31        }
32
33        return result;
34    }
35}
36