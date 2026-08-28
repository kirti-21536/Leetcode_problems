// Last updated: 8/28/2026, 9:24:57 PM
1class Solution {
2    public String lexPalindromicPermutation(String s, String target) {
3        int n = s.length();
4        int[] freq = new int[26];
5
6        for (char c : s.toCharArray()) {
7            freq[c - 'a']++;
8        }
9
10        int odd = 0;
11        char middle = 0;
12
13        for (int i = 0; i < 26; i++) {
14            if (freq[i] % 2 == 1) {
15                odd++;
16                middle = (char) ('a' + i);
17            }
18        }
19
20        if (odd > 1) {
21            return "";
22        }
23
24        int halfLen = n / 2;
25        int[] cnt = new int[26];
26
27        for (int i = 0; i < 26; i++) {
28            cnt[i] = freq[i] / 2;
29        }
30
31        char[] targetHalf = target.substring(0, halfLen).toCharArray();
32
33        char[] half = new char[halfLen];
34
35        if (!build(cnt, targetHalf, 0, half)) {
36            return "";
37        }
38
39        String candidate = makePalindrome(half, middle, n);
40
41        if (candidate.compareTo(target) > 0) {
42            return candidate;
43        }
44
45        if (!nextPermutation(half)) {
46            return "";
47        }
48
49        return makePalindrome(half, middle, n);
50    }
51
52    private boolean build(int[] cnt, char[] target, int pos, char[] half) {
53        if (pos == target.length) {
54            for (int i = 0; i < 26; i++) {
55                if (cnt[i] != 0) {
56                    return false;
57                }
58            }
59            return true;
60        }
61
62        int wanted = target[pos] - 'a';
63
64        if (cnt[wanted] > 0) {
65            cnt[wanted]--;
66            half[pos] = target[pos];
67
68            if (build(cnt, target, pos + 1, half)) {
69                cnt[wanted]++;
70                return true;
71            }
72
73            cnt[wanted]++;
74        }
75
76        for (int c = wanted + 1; c < 26; c++) {
77            if (cnt[c] > 0) {
78                cnt[c]--;
79                half[pos] = (char) ('a' + c);
80
81                int k = pos + 1;
82
83                for (int x = 0; x < 26; x++) {
84                    while (cnt[x] > 0) {
85                        half[k++] = (char) ('a' + x);
86                        cnt[x]--;
87                    }
88                }
89
90                return true;
91            }
92        }
93
94        return false;
95    }
96
97    private boolean nextPermutation(char[] a) {
98        int i = a.length - 2;
99
100        while (i >= 0 && a[i] >= a[i + 1]) {
101            i--;
102        }
103
104        if (i < 0) {
105            return false;
106        }
107
108        int j = a.length - 1;
109
110        while (a[j] <= a[i]) {
111            j--;
112        }
113
114        char temp = a[i];
115        a[i] = a[j];
116        a[j] = temp;
117
118        int l = i + 1;
119        int r = a.length - 1;
120
121        while (l < r) {
122            temp = a[l];
123            a[l] = a[r];
124            a[r] = temp;
125            l++;
126            r--;
127        }
128
129        return true;
130    }
131
132    private String makePalindrome(char[] half, char middle, int n) {
133        StringBuilder sb = new StringBuilder();
134
135        for (char c : half) {
136            sb.append(c);
137        }
138
139        if (n % 2 == 1) {
140            sb.append(middle);
141        }
142
143        for (int i = half.length - 1; i >= 0; i--) {
144            sb.append(half[i]);
145        }
146
147        return sb.toString();
148    }
149}