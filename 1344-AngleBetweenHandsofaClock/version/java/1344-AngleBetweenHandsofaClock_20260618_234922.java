// Last updated: 6/18/2026, 11:49:22 PM
1class Solution {
2    public double angleClock(int hour, int minutes) {
3        double minuteAngle = minutes * 6;
4        double hourAngle = (hour % 12) * 30 + minutes * 0.5;
5
6        double diff = Math.abs(hourAngle - minuteAngle);
7
8        return Math.min(diff, 360 - diff);
9    }
10}