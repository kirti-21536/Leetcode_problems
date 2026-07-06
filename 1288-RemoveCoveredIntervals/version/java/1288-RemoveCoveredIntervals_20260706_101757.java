// Last updated: 7/6/2026, 10:17:57 AM
1class Solution {
2    public int removeCoveredIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (a, b) -> {
4            if (a[0] == b[0]) {
5                return b[1] - a[1];
6            }
7            return a[0] - b[0];
8        });
9
10        int count = 0;
11        int maxEnd = 0;
12
13        for (int[] interval : intervals) {
14            if (interval[1] > maxEnd) {
15                count++;
16                maxEnd = interval[1];
17            }
18        }
19
20        return count;
21        
22    }
23}