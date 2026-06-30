// Last updated: 6/30/2026, 11:51:15 PM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int[] last = {-1, -1, -1}; // a, b, c
4        int ans = 0;
5        for (int i = 0; i < s.length(); i++) {
6            last[s.charAt(i) - 'a'] = i;
7            int minIndex = Math.min(last[0], Math.min(last[1], last[2]));
8            ans += minIndex + 1;
9        }
10        return ans;
11        
12    }
13}