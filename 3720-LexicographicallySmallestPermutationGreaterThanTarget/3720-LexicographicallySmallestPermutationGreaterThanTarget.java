// Last updated: 8/27/2026, 4:06:50 PM
1class Solution {
2    public String lexGreaterPermutation(String s, String target) {
3        int[] freq = new int[26];
4
5        for (char c : s.toCharArray()) {
6            freq[c - 'a']++;
7        }
8
9        char[] ans = new char[s.length()];
10
11        for (int i = 0; i < s.length(); i++) {
12            int x = target.charAt(i) - 'a';
13
14            if (freq[x] > 0) {
15                ans[i] = target.charAt(i);
16                freq[x]--;
17            } else {
18                for (int c = x + 1; c < 26; c++) {
19                    if (freq[c] > 0) {
20                        ans[i] = (char) ('a' + c);
21                        freq[c]--;
22                        fill(ans, i + 1, freq);
23                        return new String(ans);
24                    }
25                }
26
27                return backtrack(ans, i - 1, freq);
28            }
29        }
30
31        return backtrack(ans, s.length() - 1, freq);
32    }
33
34    private String backtrack(char[] ans, int pos, int[] freq) {
35        for (int i = pos; i >= 0; i--) {
36            int cur = ans[i] - 'a';
37
38            freq[cur]++;
39
40            for (int c = cur + 1; c < 26; c++) {
41                if (freq[c] > 0) {
42                    ans[i] = (char) ('a' + c);
43                    freq[c]--;
44
45                    fill(ans, i + 1, freq);
46
47                    return new String(ans);
48                }
49            }
50        }
51
52        return "";
53    }
54
55    private void fill(char[] ans, int pos, int[] freq) {
56        for (int c = 0; c < 26; c++) {
57            while (freq[c] > 0) {
58                ans[pos++] = (char) ('a' + c);
59                freq[c]--;
60            }
61        }
62    }
63}