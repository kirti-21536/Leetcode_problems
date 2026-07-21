// Last updated: 7/21/2026, 9:15:46 AM
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        int n = s.length();
4        int ones = 0;
5        int preZero = Integer.MIN_VALUE;
6        int maxMerge = 0;
7
8        int i = 0;
9        while (i < n) {
10            int j = i;
11            while (j < n && s.charAt(j) == s.charAt(i)) {
12                j++;
13            }
14
15            int len = j - i;
16
17            if (s.charAt(i) == '1') {
18                ones += len;
19            } else {
20                maxMerge = Math.max(maxMerge, preZero + len);
21                preZero = len;
22            }
23
24            i = j;
25        }
26
27        return ones + maxMerge;
28    }
29}