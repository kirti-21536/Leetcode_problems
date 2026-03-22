// Last updated: 3/23/2026, 1:28:38 AM
1class Solution {
2    public static int minMoves(int[] nums, int k) {
3        List<Integer> pos = new ArrayList<>();
4
5        // Step 1: store positions of 1s
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] == 1) pos.add(i);
8        }
9
10        int m = pos.size();
11
12        // Prefix sum for fast range sum
13        long[] prefix = new long[m + 1];
14        for (int i = 0; i < m; i++) {
15            prefix[i + 1] = prefix[i] + pos.get(i);
16        }
17
18        long res = Long.MAX_VALUE;
19
20        //sliding window
21        for (int i = 0; i + k <= m; i++) {
22            int mid = i + k / 2;
23
24            // median position
25            int median = pos.get(mid);
26
27            // left cost
28            long left = (long) median * (mid - i)
29                      - (prefix[mid] - prefix[i]);
30
31            // right cost
32            long right = (prefix[i + k] - prefix[mid + 1])
33                       - (long) median * (i + k - mid - 1);
34
35            long cost = left + right;
36
37            // adjustment
38            if (k % 2 == 1) {
39                cost -= (long)(k / 2) * (k / 2 + 1);
40            } else {
41                cost -= (long)(k / 2) * (k / 2);
42            }
43
44            res = Math.min(res, cost);
45        }
46
47        return (int) res;
48    }
49
50}