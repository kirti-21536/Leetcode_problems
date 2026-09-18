// Last updated: 9/18/2026, 9:54:22 PM
1class Solution {
2    public List<String> maxNumOfSubstrings(String s) {
3        int n = s.length();
4        int[] first = new int[26];
5        int[] last = new int[26];
6
7        Arrays.fill(first, n);
8
9        for (int i = 0; i < n; i++) {
10            int c = s.charAt(i) - 'a';
11            first[c] = Math.min(first[c], i);
12            last[c] = i;
13        }
14
15        List<int[]> intervals = new ArrayList<>();
16
17        for (int i = 0; i < n; i++) {
18            int c = s.charAt(i) - 'a';
19
20            if (i != first[c]) continue;
21
22            int end = last[c];
23            boolean valid = true;
24
25            for (int j = i; j <= end; j++) {
26                int ch = s.charAt(j) - 'a';
27
28                if (first[ch] < i) {
29                    valid = false;
30                    break;
31                }
32
33                end = Math.max(end, last[ch]);
34            }
35
36            if (valid) {
37                intervals.add(new int[]{i, end});
38            }
39        }
40
41        intervals.sort((a, b) -> a[1] - b[1]);
42
43        List<String> result = new ArrayList<>();
44        int prevEnd = -1;
45
46        for (int[] interval : intervals) {
47            if (interval[0] > prevEnd) {
48                result.add(s.substring(interval[0], interval[1] + 1));
49                prevEnd = interval[1];
50            }
51        }
52
53        return result;
54    }
55}