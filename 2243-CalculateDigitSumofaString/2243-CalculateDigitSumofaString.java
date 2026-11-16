// Last updated: 11/16/2026, 10:49:25 PM
1class Solution {
2    public String digitSum(String s, int k) {
3
4        while (s.length() > k) {
5            StringBuilder sb = new StringBuilder();
6
7            for (int i = 0; i < s.length(); i += k) {
8                int sum = 0;
9
10                for (int j = i; j < Math.min(i + k, s.length()); j++) {
11                    sum += s.charAt(j) - '0';
12                }
13
14                sb.append(sum);
15            }
16
17            s = sb.toString();
18        }
19
20        return s;
21    }
22}
23