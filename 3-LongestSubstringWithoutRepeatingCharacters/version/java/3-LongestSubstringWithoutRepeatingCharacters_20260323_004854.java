// Last updated: 3/23/2026, 12:48:54 AM
1public class Solution {
2    public static String minWindow(String s, String t) {
3        if (s.length() < t.length()) return "";
4
5        Map<Character, Integer> need = new HashMap<>();
6        for (char ch : t.toCharArray()) {
7            need.put(ch, need.getOrDefault(ch, 0) + 1);
8        }
9
10        Map<Character, Integer> window = new HashMap<>();
11
12        int left = 0, right = 0;
13        int formed = 0, required = need.size();
14
15        int minLen = Integer.MAX_VALUE;
16        int start = 0;
17
18        while (right < s.length()) {
19            char ch = s.charAt(right);
20            window.put(ch, window.getOrDefault(ch, 0) + 1);
21
22            if (need.containsKey(ch) && 
23                window.get(ch).intValue() == need.get(ch).intValue()) {
24                formed++;
25            }
26
27            // Try to shrink
28            while (left <= right && formed == required) {
29                if (right - left + 1 < minLen) {
30                    minLen = right - left + 1;
31                    start = left;
32                }
33
34                char leftChar = s.charAt(left);
35                window.put(leftChar, window.get(leftChar) - 1);
36
37                if (need.containsKey(leftChar) &&
38                    window.get(leftChar) < need.get(leftChar)) {
39                    formed--;
40                }
41
42                left++;
43            }
44
45            right++;
46        }
47
48        return minLen == Integer.MAX_VALUE ? "" 
49                                          : s.substring(start, start + minLen);
50    }
51}