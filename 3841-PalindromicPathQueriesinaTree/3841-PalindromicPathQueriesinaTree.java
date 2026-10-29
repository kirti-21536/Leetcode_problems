// Last updated: 10/29/2026, 5:00:53 PM
1class Solution {
2    List<Integer>[] graph;
3    int[] parent, depth, size, heavy, head, pos;
4    char[] chars;
5    int timer;
6    SegmentTree seg;
7
8    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {
9        graph = new ArrayList[n];
10        for (int i = 0; i < n; i++) {
11            graph[i] = new ArrayList<>();
12        }
13
14        for (int[] e : edges) {
15            graph[e[0]].add(e[1]);
16            graph[e[1]].add(e[0]);
17        }
18
19        chars = s.toCharArray();
20        parent = new int[n];
21        depth = new int[n];
22        size = new int[n];
23        heavy = new int[n];
24        head = new int[n];
25        pos = new int[n];
26
27        Arrays.fill(parent, -1);
28        Arrays.fill(heavy, -1);
29
30        int[] order = new int[n];
31        int[] stack = new int[n];
32        int top = 0, count = 0;
33
34        stack[top++] = 0;
35        parent[0] = 0;
36
37        while (top > 0) {
38            int u = stack[--top];
39            order[count++] = u;
40
41            for (int v : graph[u]) {
42                if (parent[v] != -1) continue;
43
44                parent[v] = u;
45                depth[v] = depth[u] + 1;
46                stack[top++] = v;
47            }
48        }
49
50        for (int i = n - 1; i >= 0; i--) {
51            int u = order[i];
52            size[u] = 1;
53            int maxSize = 0;
54
55            for (int v : graph[u]) {
56                if (parent[v] == u) {
57                    size[u] += size[v];
58
59                    if (size[v] > maxSize) {
60                        maxSize = size[v];
61                        heavy[u] = v;
62                    }
63                }
64            }
65        }
66
67        int[] nodes = new int[n];
68        int[] chainHeads = new int[n];
69        int top2 = 0;
70        int cur = 0;
71
72        nodes[top2] = 0;
73        chainHeads[top2++] = 0;
74
75        while (top2 > 0) {
76            int start = nodes[--top2];
77            int chainHead = chainHeads[top2];
78
79            for (int u = start; u != -1; u = heavy[u]) {
80                head[u] = chainHead;
81                pos[u] = cur++;
82
83                for (int v : graph[u]) {
84                    if (parent[v] == u && v != heavy[u]) {
85                        nodes[top2] = v;
86                        chainHeads[top2++] = v;
87                    }
88                }
89            }
90        }
91
92        seg = new SegmentTree(n);
93
94        for (int i = 0; i < n; i++) {
95            seg.update(pos[i], chars[i] - 'a');
96        }
97
98        List<Boolean> result = new ArrayList<>();
99
100        for (String q : queries) {
101            String[] p = q.split(" ");
102
103            if (p[0].equals("update")) {
104                int u = Integer.parseInt(p[1]);
105                char c = p[2].charAt(0);
106
107                chars[u] = c;
108                seg.update(pos[u], c - 'a');
109            } else {
110                int u = Integer.parseInt(p[1]);
111                int v = Integer.parseInt(p[2]);
112
113                int[] freq = new int[26];
114
115                while (head[u] != head[v]) {
116                    if (depth[head[u]] < depth[head[v]]) {
117                        int t = u;
118                        u = v;
119                        v = t;
120                    }
121
122                    int[] part = seg.query(pos[head[u]], pos[u]);
123
124                    for (int i = 0; i < 26; i++) {
125                        freq[i] += part[i];
126                    }
127
128                    u = parent[head[u]];
129                }
130
131                if (depth[u] > depth[v]) {
132                    int t = u;
133                    u = v;
134                    v = t;
135                }
136
137                int[] part = seg.query(pos[u], pos[v]);
138
139                for (int i = 0; i < 26; i++) {
140                    freq[i] += part[i];
141                }
142
143                int odd = 0;
144
145                for (int x : freq) {
146                    if (x % 2 != 0) {
147                        odd++;
148                    }
149                }
150
151                result.add(odd <= 1);
152            }
153        }
154
155        return result;
156    }
157
158    class SegmentTree {
159        int[][] tree;
160        int n;
161
162        SegmentTree(int n) {
163            this.n = n;
164            tree = new int[4 * n][26];
165        }
166
167        void update(int index, int ch) {
168            update(1, 0, n - 1, index, ch);
169        }
170
171        void update(int node, int l, int r, int index, int ch) {
172            if (l == r) {
173                Arrays.fill(tree[node], 0);
174                tree[node][ch] = 1;
175                return;
176            }
177
178            int mid = (l + r) / 2;
179
180            if (index <= mid) {
181                update(node * 2, l, mid, index, ch);
182            } else {
183                update(node * 2 + 1, mid + 1, r, index, ch);
184            }
185
186            for (int i = 0; i < 26; i++) {
187                tree[node][i] =
188                    tree[node * 2][i] + tree[node * 2 + 1][i];
189            }
190        }
191
192        int[] query(int ql, int qr) {
193            return query(1, 0, n - 1, ql, qr);
194        }
195
196        int[] query(int node, int l, int r, int ql, int qr) {
197            if (ql <= l && r <= qr) {
198                return tree[node].clone();
199            }
200
201            int mid = (l + r) / 2;
202            int[] result = new int[26];
203
204            if (ql <= mid) {
205                int[] left = query(node * 2, l, mid, ql, qr);
206
207                for (int i = 0; i < 26; i++) {
208                    result[i] += left[i];
209                }
210            }
211
212            if (qr > mid) {
213                int[] right = query(node * 2 + 1, mid + 1, r, ql, qr);
214
215                for (int i = 0; i < 26; i++) {
216                    result[i] += right[i];
217                }
218            }
219
220            return result;
221        }
222    }
223}
224