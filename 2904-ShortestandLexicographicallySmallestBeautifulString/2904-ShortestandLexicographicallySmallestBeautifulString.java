// Last updated: 8/26/2026, 10:52:47 AM
1class Solution {
2    public String shortestBeautifulSubstring(String s, int k) {
3        int left = 0, count = 0;
4        int minLen = Integer.MAX_VALUE;
5        String ans = "";
6        for (int right = 0; right < s.length(); right++) {
7            if (s.charAt(right) == '1') count++;
8            
9            while (count > k || (count == k && s.charAt(left) == '0')) {
10                if (s.charAt(left) == '1') count--;
11                left++;
12            }
13
14            if (count == k) {
15                String curr = s.substring(left, right + 1);
16
17                if (curr.length() < minLen ||
18                    (curr.length() == minLen && curr.compareTo(ans) < 0)) {
19                    minLen = curr.length();
20                    ans = curr;
21                }
22            }
23        }
24
25        return ans;
26    }
27}