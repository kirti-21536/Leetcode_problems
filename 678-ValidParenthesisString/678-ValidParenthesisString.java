// Last updated: 10/4/2026, 11:36:22 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        int min = 0;
4        int max = 0;
5
6        for (char ch : s.toCharArray()) {
7            if (ch == '(') {
8                min++;
9                max++;
10            } 
11            else if (ch == ')') {
12                min--;
13                max--;
14            } 
15            else { // '*'
16                min--;
17                max++;
18            }
19            if (min < 0) {
20                min = 0;
21            }
22            if (max < 0) {
23                return false;
24            }
25        }
26
27        return min == 0;
28    }
29}