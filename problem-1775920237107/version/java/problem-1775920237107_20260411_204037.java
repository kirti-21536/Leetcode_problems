// Last updated: 4/11/2026, 8:40:37 PM
1class Solution {
2    public String trafficSignal(int timer) {
3        if (timer == 0) return "Green";
4        else if (timer == 30) return "Orange";
5        else if (timer > 30 && timer <= 90) return "Red";
6        else return "Invalid";
7        
8    }
9}