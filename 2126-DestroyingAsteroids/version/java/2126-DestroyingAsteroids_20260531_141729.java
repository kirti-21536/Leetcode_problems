// Last updated: 5/31/2026, 2:17:29 PM
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        Arrays.sort(asteroids);
4
5        long currMass = mass;
6
7        for (int asteroid : asteroids) {
8            if (currMass < asteroid) {
9                return false;
10            }
11            currMass += asteroid;
12        }
13
14        return true;
15    }
16}