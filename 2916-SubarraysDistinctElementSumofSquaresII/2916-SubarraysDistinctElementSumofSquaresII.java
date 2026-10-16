// Last updated: 10/16/2026, 4:06:42 PM
1class Solution {
2    static final int MOD = 1_000_000_007;
3
4    int[] sum, sq, lazy;
5    int n;
6
7    public int sumCounts(int[] nums) {
8        n = nums.length;
9        sum = new int[4 * n];
10        sq = new int[4 * n];
11        lazy = new int[4 * n];
12
13        int[] last = new int[100001];
14        Arrays.fill(last, -1);
15
16        long ans = 0;
17
18        for (int i = 0; i < n; i++) {
19            int l = last[nums[i]] + 1;
20            update(1, 0, n - 1, l, i);
21            last[nums[i]] = i;
22            ans = (ans + sq[1]) % MOD;
23        }
24
25        return (int) ans;
26    }
27
28    void apply(int node, int left, int right, int val) {
29        long len = right - left + 1L;
30
31        sq[node] = (int) ((sq[node]
32                + 2L * val * sum[node]
33                + len * val * val) % MOD);
34
35        sum[node] = (int) ((sum[node] + len * val) % MOD);
36        lazy[node] = (lazy[node] + val) % MOD;
37    }
38
39    void push(int node, int left, int right) {
40        if (lazy[node] == 0 || left == right) return;
41
42        int mid = left + (right - left) / 2;
43        apply(node * 2, left, mid, lazy[node]);
44        apply(node * 2 + 1, mid + 1, right, lazy[node]);
45        lazy[node] = 0;
46    }
47
48    void update(int node, int left, int right, int ql, int qr) {
49        if (ql > right || qr < left) return;
50
51        if (ql <= left && right <= qr) {
52            apply(node, left, right, 1);
53            return;
54        }
55
56        push(node, left, right);
57
58        int mid = left + (right - left) / 2;
59
60        update(node * 2, left, mid, ql, qr);
61        update(node * 2 + 1, mid + 1, right, ql, qr);
62
63        sum[node] = (int) ((sum[node * 2]
64                + (long) sum[node * 2 + 1]) % MOD);
65
66        sq[node] = (int) ((sq[node * 2]
67                + (long) sq[node * 2 + 1]) % MOD);
68    }
69}
70