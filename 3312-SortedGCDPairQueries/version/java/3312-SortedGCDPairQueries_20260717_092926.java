// Last updated: 7/17/2026, 9:29:26 AM
1class Solution {
2    public int[] gcdValues(int[] nums, long[] queries) {
3        int max = 0;
4        for (int x : nums) max = Math.max(max, x);
5
6        int[] freq = new int[max + 1];
7        for (int x : nums) freq[x]++;
8
9        long[] gcdCount = new long[max + 1];
10
11        for (int g = max; g >= 1; g--) {
12            int divisible = 0;
13
14            for (int multiple = g; multiple <= max; multiple += g) {
15                divisible += freq[multiple];
16                gcdCount[g] -= gcdCount[multiple];
17            }
18
19            gcdCount[g] += 1L * divisible * (divisible - 1) / 2;
20        }
21
22        for (int i = 2; i <= max; i++) {
23            gcdCount[i] += gcdCount[i - 1];
24        }
25
26        int[] ans = new int[queries.length];
27        for (int i = 0; i < queries.length; i++) {
28            ans[i] = upperBound(gcdCount, queries[i]);
29        }
30
31        return ans;
32    }
33
34    private int upperBound(long[] prefix, long target) {
35        int l = 1, r = prefix.length - 1;
36        int ans = r;
37
38        while (l <= r) {
39            int mid = l + (r - l) / 2;
40            if (prefix[mid] > target) {
41                ans = mid;
42                r = mid - 1;
43            } else {
44                l = mid + 1;
45            }
46        }
47
48        return ans;
49    }
50}
51