// Last updated: 7/19/2026, 4:07:21 PM
1class Solution {
2    public String smallestSubsequence(String s) {
3        int[] last = new int[26];
4
5        for (int i = 0; i < s.length(); i++) {
6            last[s.charAt(i) - 'a'] = i;
7        }
8
9        boolean[] visited = new boolean[26];
10        StringBuilder stack = new StringBuilder();
11
12        for (int i = 0; i < s.length(); i++) {
13            char c = s.charAt(i);
14
15            if (visited[c - 'a']) continue;
16
17            while (stack.length() > 0) {
18                char top = stack.charAt(stack.length() - 1);
19
20                if (top > c && last[top - 'a'] > i) {
21                    visited[top - 'a'] = false;
22                    stack.deleteCharAt(stack.length() - 1);
23                } else {
24                    break;
25                }
26            }
27
28            stack.append(c);
29            visited[c - 'a'] = true;
30        }
31
32        return stack.toString();
33    }
34}