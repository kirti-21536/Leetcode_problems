// Last updated: 8/7/2026, 11:44:32 PM
1import java.util.*;
2
3class Solution {
4    // Factor representations for digits 0 to 9: {2s, 3s, 5s, 7s}
5    private static final int[][] DIGIT_FACTORS = {
6        {0, 0, 0, 0}, // 0 (unused)
7        {0, 0, 0, 0}, // 1
8        {1, 0, 0, 0}, // 2
9        {0, 1, 0, 0}, // 3
10        {2, 0, 0, 0}, // 4
11        {0, 0, 1, 0}, // 5
12        {1, 1, 0, 0}, // 6
13        {0, 0, 0, 1}, // 7
14        {3, 0, 0, 0}, // 8
15        {0, 2, 0, 0}  // 9
16    };
17
18    public String smallestNumber(String num, long t) {
19        int[] targetFactors = factorize(t);
20        if (targetFactors == null) return "-1";
21
22        int n = num.length();
23
24        // Step 1: Try to find a solution of the same length n
25        String sameLenAns = solveSameLength(num, targetFactors);
26        if (sameLenAns != null) {
27            return sameLenAns;
28        }
29
30        // Step 2: If no same-length solution, construct the smallest longer solution
31        int minLenNeeded = minDigitsNeeded(targetFactors[0], targetFactors[1], targetFactors[2], targetFactors[3]);
32        int targetLen = Math.max(n + 1, minLenNeeded);
33
34        return fillSmallest(targetLen, targetFactors);
35    }
36
37    // Factorizes t into counts of primes [2, 3, 5, 7]. Returns null if prime factor > 7 exists.
38    private int[] factorize(long t) {
39        int[] factors = new int[4];
40        int[] primes = {2, 3, 5, 7};
41        for (int i = 0; i < 4; i++) {
42            while (t % primes[i] == 0) {
43                factors[i]++;
44                t /= primes[i];
45            }
46        }
47        return t == 1 ? factors : null;
48    }
49
50    // Computes minimum digits required for given factor counts
51    private int minDigitsNeeded(int e2, int e3, int e5, int e7) {
52        int count = e5 + e7;
53        int count8 = e2 / 3;
54        e2 %= 3;
55        int count9 = e3 / 2;
56        e3 %= 2;
57
58        count += count8 + count9;
59
60        if (e2 == 2 && e3 == 1) { // 4 and 3 -> 2 digits
61            count += 2;
62        } else if (e2 == 1 && e3 == 1) { // 6 -> 1 digit
63            count += 1;
64        } else if (e2 > 0 || e3 > 0) {
65            count += 1;
66        }
67
68        return count;
69    }
70
71    private String solveSameLength(String num, int[] targetFactors) {
72        int n = num.length();
73        int[] prefFactors = new int[4];
74        int zeroIdx = num.indexOf('0');
75
76        // Check exact match (if num has no '0' and already satisfies product condition)
77        if (zeroIdx == -1) {
78            for (int i = 0; i < n; i++) {
79                int d = num.charAt(i) - '0';
80                for (int k = 0; k < 4; k++) {
81                    prefFactors[k] += DIGIT_FACTORS[d][k];
82                }
83            }
84            if (isSatisfied(prefFactors, targetFactors)) {
85                return num;
86            }
87        }
88
89        // Backtrack from right to left to find the first index i where we can increase num[i]
90        int limit = (zeroIdx == -1) ? n - 1 : zeroIdx;
91
92        // Recompute prefix factors up to 'limit'
93        Arrays.fill(prefFactors, 0);
94        for (int i = 0; i < limit; i++) {
95            int d = num.charAt(i) - '0';
96            for (int k = 0; k < 4; k++) {
97                prefFactors[k] += DIGIT_FACTORS[d][k];
98            }
99        }
100
101        for (int i = limit; i >= 0; i--) {
102            int startDigit = num.charAt(i) - '0' + 1;
103
104            for (int d = startDigit; d <= 9; d++) {
105                int[] curFactors = prefFactors.clone();
106                for (int k = 0; k < 4; k++) {
107                    curFactors[k] += DIGIT_FACTORS[d][k];
108                }
109
110                int remLen = n - 1 - i;
111                int[] remFactors = new int[4];
112                for (int k = 0; k < 4; k++) {
113                    remFactors[k] = Math.max(0, targetFactors[k] - curFactors[k]);
114                }
115
116                if (minDigitsNeeded(remFactors[0], remFactors[1], remFactors[2], remFactors[3]) <= remLen) {
117                    // Valid prefix found! Construct full string.
118                    StringBuilder sb = new StringBuilder();
119                    sb.append(num, 0, i).append(d);
120                    sb.append(fillSmallest(remLen, remFactors));
121                    return sb.toString();
122                }
123            }
124
125            // Remove factors of num[i] before moving left
126            if (i > 0) {
127                int d = num.charAt(i - 1) - '0';
128                for (int k = 0; k < 4; k++) {
129                    prefFactors[k] -= DIGIT_FACTORS[d][k];
130                }
131            }
132        }
133
134        return null;
135    }
136
137    private boolean isSatisfied(int[] current, int[] target) {
138        for (int i = 0; i < 4; i++) {
139            if (current[i] < target[i]) return false;
140        }
141        return true;
142    }
143
144    // Generates the lexicographically smallest string of length `len` meeting required factors
145    private String fillSmallest(int len, int[] factors) {
146        StringBuilder sb = new StringBuilder();
147        int[] req = factors.clone();
148
149        for (int i = 0; i < len; i++) {
150            int remLen = len - 1 - i;
151            for (int d = 1; d <= 9; d++) {
152                int[] nextReq = new int[4];
153                for (int k = 0; k < 4; k++) {
154                    nextReq[k] = Math.max(0, req[k] - DIGIT_FACTORS[d][k]);
155                }
156
157                if (minDigitsNeeded(nextReq[0], nextReq[1], nextReq[2], nextReq[3]) <= remLen) {
158                    sb.append(d);
159                    req = nextReq;
160                    break;
161                }
162            }
163        }
164
165        return sb.toString();
166    }
167}