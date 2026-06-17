// Last updated: 6/17/2026, 10:46:30 AM
1class Solution {
2    public char processStr(String s, long k) {
3        int n = s.length();
4        long[] lengths = new long[n];
5        long len = 0;
6
7        // Forward pass
8        for (int i = 0; i < n; i++) {
9            char ch = s.charAt(i);
10
11            if (ch >= 'a' && ch <= 'z') {
12                len++;
13            } else if (ch == '*') {
14                if (len > 0) len--;
15            } else if (ch == '#') {
16                len *= 2;
17            } 
18            lengths[i] = len;
19        }
20
21        if (k >= len) return '.';
22
23        // Backward pass
24        for (int i = n - 1; i >= 0; i--) {
25            char ch = s.charAt(i);
26            len = lengths[i];
27
28            if (ch >= 'a' && ch <= 'z') {
29                if (k == len - 1) return ch;
30            } 
31            else if (ch == '*') {
32                // Reverse of deletion
33                continue;
34            } 
35            else if (ch == '#') {
36                long half = len / 2;
37                k %= half;
38            } 
39            else if (ch == '%') {
40                k = len - 1 - k;
41            }
42        }
43
44        return '.';
45    }
46}