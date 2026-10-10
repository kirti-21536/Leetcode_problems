// Last updated: 10/10/2026, 8:52:45 PM
1
2class Solution {
3    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
4        long k = (long) k1 + k2;
5        int n = nums1.length;
6        int[] diff = new int[n];
7
8        int max = 0;
9        for (int i = 0; i < n; i++) {
10            diff[i] = Math.abs(nums1[i] - nums2[i]);
11            max = Math.max(max, diff[i]);
12        }
13
14        long low = 0, high = max;
15
16        while (low < high) {
17            long mid = low + (high - low) / 2;
18            long needed = 0;
19
20            for (int d : diff) {
21                if (d > mid) {
22                    needed += d - mid;
23                }
24            }
25
26            if (needed <= k) {
27                high = mid;
28            } else {
29                low = mid + 1;
30            }
31        }
32
33        long ans = 0;
34        for (int d : diff) {
35            long remaining = Math.min(d, (int) low);
36            ans += remaining * remaining;
37        }
38
39        long used = 0;
40        for (int d : diff) {
41            if (d > low) {
42                used += d - low;
43            }
44        }
45
46        long extra = k - used;
47        if (extra > 0) {
48            for (int d : diff) {
49                if (d >= low && low > 0 && extra > 0) {
50                    ans -= (long) low * low - (low - 1) * (low - 1);
51                    extra--;
52                }
53            }
54        }
55
56        return ans;
57    }
58}
59