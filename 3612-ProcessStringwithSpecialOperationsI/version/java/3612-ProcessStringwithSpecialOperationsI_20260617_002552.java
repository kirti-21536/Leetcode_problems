// Last updated: 6/17/2026, 12:25:52 AM
1class Solution {
2    public String processStr(String s) {
3        StringBuilder result = new StringBuilder();
4
5        for (char ch : s.toCharArray()) {
6            if (ch >= 'a' && ch <= 'z') {
7                result.append(ch);
8            } 
9            else if (ch == '*') {
10                if (result.length() > 0) {
11                    result.deleteCharAt(result.length() - 1);
12                }
13            } 
14            else if (ch == '#') {
15                String curr = result.toString();
16                result.append(curr);
17            } 
18            else if (ch == '%') {
19                result.reverse();
20            }
21        }
22        return result.toString();
23    }
24}