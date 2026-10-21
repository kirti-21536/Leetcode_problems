// Last updated: 10/21/2026, 8:38:22 PM
1class Solution {
2    public int minOperations(String s) {
3        int n = s.length();
4        int mn = s.charAt(0);
5        int mx = s.charAt(0);
6        boolean sorted = true;
7
8        for (int i = 0; i < n; i++) {
9            mn = Math.min(mn, s.charAt(i));
10            mx = Math.max(mx, s.charAt(i));
11
12            if (i > 0 && s.charAt(i) < s.charAt(i - 1)) {
13                sorted = false;
14            }
15        }
16
17        if (sorted) return 0;
18        if (n == 2) return -1;
19
20        if (s.charAt(0) == mn || s.charAt(n - 1) == mx) {
21            return 1;
22        }
23
24        for (int i = 1; i < n - 1; i++) {
25            if (s.charAt(i) == mn || s.charAt(i) == mx) {
26                return 2;
27            }
28        }
29
30        return 3;
31    }
32}