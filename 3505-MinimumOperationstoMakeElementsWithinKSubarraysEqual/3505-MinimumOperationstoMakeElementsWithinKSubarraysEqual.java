// Last updated: 11/4/2026, 10:57:19 PM
1class Solution {
2
3    PriorityQueue<Long> small =
4        new PriorityQueue<>(Collections.reverseOrder());
5
6    PriorityQueue<Long> large =
7        new PriorityQueue<>();
8
9    boolean[] active;
10    boolean[] inSmall;
11
12    int smallSize, largeSize, target, windowSize;
13    long smallSum, largeSum;
14
15    int getValue(long key) {
16        return (int)(key >> 20);
17    }
18
19    int getIndex(long key) {
20        return (int)(key & ((1 << 20) - 1));
21    }
22
23    void prune(PriorityQueue<Long> pq) {
24        while (!pq.isEmpty()) {
25            int idx = getIndex(pq.peek());
26
27            if (active[idx]) break;
28
29            pq.poll();
30        }
31    }
32
33    void balance() {
34
35        prune(small);
36        prune(large);
37
38        int required = Math.min(target, windowSize);
39
40        while (smallSize > required) {
41
42            prune(small);
43
44            long key = small.poll();
45
46            int val = getValue(key);
47            int idx = getIndex(key);
48
49            inSmall[idx] = false;
50
51            smallSize--;
52            smallSum -= val;
53
54            large.offer(key);
55
56            largeSize++;
57            largeSum += val;
58        }
59
60        while (smallSize < required) {
61
62            prune(large);
63
64            long key = large.poll();
65
66            int val = getValue(key);
67            int idx = getIndex(key);
68
69            inSmall[idx] = true;
70
71            largeSize--;
72            largeSum -= val;
73
74            small.offer(key);
75
76            smallSize++;
77            smallSum += val;
78        }
79    }
80
81    void add(int val, int idx) {
82
83        long key = ((long) val << 20) | idx;
84
85        active[idx] = true;
86
87        prune(small);
88
89        if (small.isEmpty() || key <= small.peek()) {
90
91            small.offer(key);
92            inSmall[idx] = true;
93
94            smallSize++;
95            smallSum += val;
96
97        } else {
98
99            large.offer(key);
100            inSmall[idx] = false;
101
102            largeSize++;
103            largeSum += val;
104        }
105
106        windowSize++;
107        balance();
108    }
109
110    void remove(int val, int idx) {
111
112        active[idx] = false;
113
114        if (inSmall[idx]) {
115
116            smallSize--;
117            smallSum -= val;
118
119        } else {
120
121            largeSize--;
122            largeSum -= val;
123        }
124
125        windowSize--;
126        balance();
127    }
128
129    long getCost() {
130
131        prune(small);
132
133        long median = getValue(small.peek());
134
135        return median * smallSize - smallSum
136             + largeSum - median * largeSize;
137    }
138
139    public long minOperations(int[] nums, int x, int k) {
140
141        int n = nums.length;
142
143        small.clear();
144        large.clear();
145
146        active = new boolean[n];
147        inSmall = new boolean[n];
148
149        smallSize = 0;
150        largeSize = 0;
151        smallSum = 0;
152        largeSum = 0;
153        windowSize = 0;
154
155        target = (x + 1) / 2;
156
157        long[] cost = new long[n - x + 1];
158
159        for (int i = 0; i < x; i++) {
160            add(nums[i], i);
161        }
162
163        cost[0] = getCost();
164
165        for (int i = x; i < n; i++) {
166
167            remove(nums[i - x], i - x);
168
169            add(nums[i], i);
170
171            cost[i - x + 1] = getCost();
172        }
173
174        long INF = Long.MAX_VALUE / 4;
175
176        long[] prev = new long[n + 1];
177
178        for (int j = 1; j <= k; j++) {
179
180            long[] curr = new long[n + 1];
181
182            Arrays.fill(curr, INF);
183
184            for (int i = 1; i <= n; i++) {
185
186                curr[i] = curr[i - 1];
187
188                if (i >= x && prev[i - x] != INF) {
189
190                    curr[i] = Math.min(
191                        curr[i],
192                        prev[i - x] + cost[i - x]
193                    );
194                }
195            }
196
197            prev = curr;
198        }
199
200        return prev[n];
201    }
202}
203