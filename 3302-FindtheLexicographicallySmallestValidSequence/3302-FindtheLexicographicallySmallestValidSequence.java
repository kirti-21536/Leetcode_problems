// Last updated: 8/8/2026, 4:13:43 PM
1class Solution {
2    public int[] validSequence(String word1, String word2) {
3        int n = word1.length(), m = word2.length();
4        int[] last = new int[m];
5        java.util.Arrays.fill(last, -1);
6
7        int i = n - 1, j = m - 1;
8
9        while (i >= 0 && j >= 0) {
10            if (word1.charAt(i) == word2.charAt(j)) {
11                last[j--] = i;
12            }
13            i--;
14        }
15
16        int[] ans = new int[m];
17        j = 0;
18        boolean used = false;
19        for (i = 0; i < n && j < m; i++) {
20            if (word1.charAt(i) == word2.charAt(j)) {
21                ans[j++] = i;
22            } else if (!used && (j == m - 1 || i < last[j + 1])) {
23                ans[j++] = i;
24                used = true;
25            }
26        }
27        return j == m ? ans : new int[0];
28    }
29}