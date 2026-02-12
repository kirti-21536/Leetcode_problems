// Last updated: 2/12/2026, 11:37:35 PM
1class Solution {
2    public int longestBalanced(String s) {
3        int n = s.length();
4        int maxLen = 0;
5
6        for (int i = 0; i < n; i++) {
7            int[] freq = new int[26];
8            int distinct = 0;
9            int maxFreq = 0;
10
11            for (int j = i; j < n; j++) {
12                int idx = s.charAt(j) - 'a';
13
14                if (freq[idx] == 0) {
15                    distinct++;
16                }
17
18                freq[idx]++;
19                maxFreq = Math.max(maxFreq, freq[idx]);
20
21                int length = j - i + 1;
22
23                // If balanced
24                if (length == distinct * maxFreq) {
25                    maxLen = Math.max(maxLen, length);
26                }
27            }
28        }
29
30        return maxLen;
31    }
32}
33