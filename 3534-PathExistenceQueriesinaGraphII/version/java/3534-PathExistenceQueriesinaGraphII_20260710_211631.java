// Last updated: 7/10/2026, 9:16:31 PM
1class Solution {
2    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
3         int[][] pairs = new int[n][2];
4        for (int i = 0; i < n; i++) {
5            pairs[i][0] = nums[i];
6            pairs[i][1] = i;
7        }
8
9        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
10
11        final int LOG = 20;
12        int[][] up = new int[n][LOG];
13
14        int r = n - 1;
15
16        for (int l = n - 1; l >= 0; l--) {
17            while (pairs[r][0] - pairs[l][0] > maxDiff) {
18                r--;
19            }
20
21            int u = pairs[l][1];
22            int v = pairs[r][1];
23
24            up[u][0] = v;
25            for (int k = 1; k < LOG; k++) {
26                up[u][k] = up[up[u][k - 1]][k - 1];
27            }
28        }
29
30        int[] ans = new int[queries.length];
31
32        for (int i = 0; i < queries.length; i++) {
33            int u = queries[i][0];
34            int v = queries[i][1];
35
36            if (nums[u] > nums[v]) {
37                int temp = u;
38                u = v;
39                v = temp;
40            }
41
42            if (u == v) {
43                ans[i] = 0;
44                continue;
45            }
46
47            if (nums[u] == nums[v]) {
48                ans[i] = 1;
49                continue;
50            }
51
52            int dist = 0;
53
54            for (int k = LOG - 1; k >= 0; k--) {
55                if (nums[up[u][k]] < nums[v]) {
56                    dist += 1 << k;
57                    u = up[u][k];
58                }
59            }
60
61            if (nums[up[u][0]] < nums[v]) {
62                ans[i] = -1;
63            } else {
64                ans[i] = dist + 1;
65            }
66        }
67
68        return ans;
69        
70    }
71}