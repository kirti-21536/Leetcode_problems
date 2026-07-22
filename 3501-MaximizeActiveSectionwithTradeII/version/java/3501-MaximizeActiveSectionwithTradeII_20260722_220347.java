// Last updated: 7/22/2026, 10:03:47 PM
1class Solution {
2    static class Group {
3        int start, length;
4
5        Group(int s, int l) {
6            start = s;
7            length = l;
8        }
9    }
10
11    static class SparseTable {
12        int[][] st;
13
14        SparseTable(int[] nums) {
15            int n = nums.length;
16            if (n == 0) {
17                st = new int[1][0];
18                return;
19            }
20
21            int K = 32 - Integer.numberOfLeadingZeros(n);
22            st = new int[K][n];
23            System.arraycopy(nums, 0, st[0], 0, n);
24
25            for (int k = 1; k < K; k++) {
26                for (int i = 0; i + (1 << k) <= n; i++) {
27                    st[k][i] = Math.max(st[k - 1][i],
28                            st[k - 1][i + (1 << (k - 1))]);
29                }
30            }
31        }
32
33        int query(int l, int r) {
34            if (l > r) return Integer.MIN_VALUE;
35            int len = r - l + 1;
36            int k = 31 - Integer.numberOfLeadingZeros(len);
37            return Math.max(st[k][l], st[k][r - (1 << k) + 1]);
38        }
39    }
40
41    public List<Integer> maxActiveSectionsAfterTrade(String s, int[][] queries) {
42        int ones = 0;
43        for (char c : s.toCharArray())
44            if (c == '1') ones++;
45
46        List<Group> zeroGroups = new ArrayList<>();
47        int[] zeroGroupIndex = new int[s.length()];
48
49        for (int i = 0; i < s.length(); i++) {
50            if (s.charAt(i) == '0') {
51                if (i > 0 && s.charAt(i - 1) == '0') {
52                    zeroGroups.get(zeroGroups.size() - 1).length++;
53                } else {
54                    zeroGroups.add(new Group(i, 1));
55                }
56            }
57            zeroGroupIndex[i] = zeroGroups.size() - 1;
58        }
59
60        if (zeroGroups.isEmpty()) {
61            List<Integer> ans = new ArrayList<>();
62            for (int i = 0; i < queries.length; i++)
63                ans.add(ones);
64            return ans;
65        }
66
67        int[] merge = new int[Math.max(0, zeroGroups.size() - 1)];
68        for (int i = 0; i + 1 < zeroGroups.size(); i++)
69            merge[i] = zeroGroups.get(i).length + zeroGroups.get(i + 1).length;
70
71        SparseTable st = new SparseTable(merge);
72
73        List<Integer> ans = new ArrayList<>();
74
75        for (int[] q : queries) {
76            int l = q[0], r = q[1];
77
78            int left = zeroGroupIndex[l] == -1 ? -1 :
79                    zeroGroups.get(zeroGroupIndex[l]).length -
80                            (l - zeroGroups.get(zeroGroupIndex[l]).start);
81
82            int right = zeroGroupIndex[r] == -1 ? -1 :
83                    (r - zeroGroups.get(zeroGroupIndex[r]).start + 1);
84
85            int startAdj = zeroGroupIndex[l] + 1;
86            int endAdj = (s.charAt(r) == '1')
87                    ? zeroGroupIndex[r]
88                    : zeroGroupIndex[r] - 1;
89
90            int best = ones;
91
92            if (s.charAt(l) == '0'
93                    && s.charAt(r) == '0'
94                    && zeroGroupIndex[l] + 1 == zeroGroupIndex[r]) {
95                best = Math.max(best, ones + left + right);
96            } else if (startAdj <= endAdj - 1) {
97                best = Math.max(best,
98                        ones + st.query(startAdj, endAdj - 1));
99            }
100
101            if (s.charAt(l) == '0'
102                    && zeroGroupIndex[l] + 1 <= endAdj) {
103                best = Math.max(best,
104                        ones + left +
105                                zeroGroups.get(zeroGroupIndex[l] + 1).length);
106            }
107
108            if (s.charAt(r) == '0'
109                    && zeroGroupIndex[l] < zeroGroupIndex[r] - 1) {
110                best = Math.max(best,
111                        ones + right +
112                                zeroGroups.get(zeroGroupIndex[r] - 1).length);
113            }
114
115            ans.add(best);
116        }
117
118        return ans;
119    }
120}