// Last updated: 5/20/2026, 11:19:57 AM
1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        int n = A.length;
4        int[] freq = new int[n + 1];
5        int[] ans = new int[n];
6
7        int common = 0;
8        for (int i = 0; i < n; i++) {
9            freq[A[i]]++;
10            if (freq[A[i]] == 2) {
11                common++;
12            }
13            freq[B[i]]++;
14            if (freq[B[i]] == 2) {
15                common++;
16            }
17            ans[i] = common;
18        }
19
20        return ans;
21    }
22}