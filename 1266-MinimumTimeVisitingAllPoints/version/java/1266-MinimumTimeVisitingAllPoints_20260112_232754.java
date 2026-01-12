// Last updated: 1/12/2026, 11:27:54 PM
1class Solution {
2    public int minTimeToVisitAllPoints(int[][] points) {
3        int time = 0;
4
5        for (int i = 1; i < points.length; i++) {
6            int dx = Math.abs(points[i][0] - points[i - 1][0]);
7            int dy = Math.abs(points[i][1] - points[i - 1][1]);
8            time += Math.max(dx, dy);
9        }
10        return time;        
11    }
12}