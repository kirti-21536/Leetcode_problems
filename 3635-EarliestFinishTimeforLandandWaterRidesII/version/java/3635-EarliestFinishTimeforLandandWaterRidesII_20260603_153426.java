// Last updated: 6/3/2026, 3:34:26 PM
1class Solution {
2
3    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
4                                  int[] waterStartTime, int[] waterDuration) {
5
6        long ans = Math.min(
7            solve(landStartTime, landDuration,
8                  waterStartTime, waterDuration),
9
10            solve(waterStartTime, waterDuration,
11                  landStartTime, landDuration)
12        );
13
14        return (int) ans;
15    }
16
17    private long solve(int[] start1, int[] dur1,
18                       int[] start2, int[] dur2) {
19
20        int m = start2.length;
21
22        int[][] rides = new int[m][2];
23        for (int i = 0; i < m; i++) {
24            rides[i][0] = start2[i]; // start
25            rides[i][1] = dur2[i];   // duration
26        }
27
28        Arrays.sort(rides, (a, b) -> Integer.compare(a[0], b[0]));
29
30        long[] prefMinDur = new long[m];
31        prefMinDur[0] = rides[0][1];
32
33        for (int i = 1; i < m; i++) {
34            prefMinDur[i] = Math.min(prefMinDur[i - 1], rides[i][1]);
35        }
36
37        long[] suffMinSD = new long[m];
38        suffMinSD[m - 1] = (long) rides[m - 1][0] + rides[m - 1][1];
39
40        for (int i = m - 2; i >= 0; i--) {
41            suffMinSD[i] = Math.min(
42                suffMinSD[i + 1],
43                (long) rides[i][0] + rides[i][1]
44            );
45        }
46
47        long res = Long.MAX_VALUE;
48
49        for (int i = 0; i < start1.length; i++) {
50
51            long finish = (long) start1[i] + dur1[i];
52
53            int idx = upperBound(rides, finish);
54
55            if (idx > 0) {
56                res = Math.min(res, finish + prefMinDur[idx - 1]);
57            }
58
59            if (idx < m) {
60                res = Math.min(res, suffMinSD[idx]);
61            }
62        }
63
64        return res;
65    }
66
67    private int upperBound(int[][] rides, long target) {
68        int l = 0, r = rides.length;
69
70        while (l < r) {
71            int mid = (l + r) >>> 1;
72
73            if (rides[mid][0] <= target) {
74                l = mid + 1;
75            } else {
76                r = mid;
77            }
78        }
79
80        return l;
81    }
82}