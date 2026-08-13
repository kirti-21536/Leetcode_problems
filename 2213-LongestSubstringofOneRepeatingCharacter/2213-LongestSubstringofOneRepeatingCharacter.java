// Last updated: 8/13/2026, 9:31:23 AM
1class Solution {
2    int[] leftChar, rightChar;
3    int[] prefix, suffix, max, len;
4    int n;
5
6    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
7        n = s.length();
8
9        int size = 4 * n;
10
11        leftChar = new int[size];
12        rightChar = new int[size];
13        prefix = new int[size];
14        suffix = new int[size];
15        max = new int[size];
16        len = new int[size];
17
18        build(1, 0, n - 1, s);
19
20        int q = queryCharacters.length();
21        int[] ans = new int[q];
22
23        for (int i = 0; i < q; i++) {
24            update(1, 0, n - 1,
25                   queryIndices[i],
26                   queryCharacters.charAt(i));
27
28            ans[i] = max[1];
29        }
30
31        return ans;
32    }
33
34    void build(int node, int l, int r, String s) {
35        if (l == r) {
36            leftChar[node] = rightChar[node] = s.charAt(l);
37            prefix[node] = suffix[node] = max[node] = len[node] = 1;
38            return;
39        }
40
41        int mid = (l + r) / 2;
42
43        build(node * 2, l, mid, s);
44        build(node * 2 + 1, mid + 1, r, s);
45
46        merge(node, node * 2, node * 2 + 1);
47    }
48
49    void update(int node, int l, int r, int index, char ch) {
50        if (l == r) {
51            leftChar[node] = rightChar[node] = ch;
52            prefix[node] = suffix[node] = max[node] = len[node] = 1;
53            return;
54        }
55
56        int mid = (l + r) / 2;
57
58        if (index <= mid)
59            update(node * 2, l, mid, index, ch);
60        else
61            update(node * 2 + 1, mid + 1, r, index, ch);
62
63        merge(node, node * 2, node * 2 + 1);
64    }
65
66    void merge(int node, int L, int R) {
67        len[node] = len[L] + len[R];
68
69        leftChar[node] = leftChar[L];
70        rightChar[node] = rightChar[R];
71
72        prefix[node] = prefix[L];
73        suffix[node] = suffix[R];
74
75        max[node] = Math.max(max[L], max[R]);
76
77        if (rightChar[L] == leftChar[R]) {
78            max[node] = Math.max(max[node], suffix[L] + prefix[R]);
79
80            if (prefix[L] == len[L])
81                prefix[node] = len[L] + prefix[R];
82
83            if (suffix[R] == len[R])
84                suffix[node] = len[R] + suffix[L];
85        }
86    }
87}
88// class Solution {
89//     public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
90//         int n=queryCharacters.length();
91//         int ans[]=new int[n];
92//         StringBuilder sb = new StringBuilder(s);
93//         for(int i=0;i<n;i++){
94//         sb.setCharAt(queryIndices[i], queryCharacters.charAt(i));
95//         ans[i]=longest_length(sb.toString());
96//         }
97//         return ans;
98//     }
99//     public static int longest_length(String s){
100//         int res=0;
101//         int count=0;
102//         int left=0;
103//         int right=0;
104//         while(right<s.length()){
105//             while(right<s.length() && s.charAt(left)==s.charAt(right)){
106//                 count++;
107//                 right++;
108//             }
109//             res=Math.max(res,count);
110//             left=right;
111//             count=0;
112//             }
113//             return res;
114//     }
115// }