// Last updated: 9/19/2026, 11:53:28 AM
1
2class Solution {
3    public boolean checkOverlap(int radius, int xCenter, int yCenter,
4                                int x1, int y1, int x2, int y2) {
5
6        int closestX = Math.max(x1, Math.min(xCenter, x2));
7        int closestY = Math.max(y1, Math.min(yCenter, y2));
8
9        long dx = xCenter - closestX;
10        long dy = yCenter - closestY;
11
12        return dx * dx + dy * dy <= (long) radius * radius;
13    }
14}