// Last updated: 8/1/2026, 12:01:11 AM
class Solution {
    public String trafficSignal(int timer) {
        if (timer == 0) return "Green";
        else if (timer == 30) return "Orange";
        else if (timer > 30 && timer <= 90) return "Red";
        else return "Invalid";
        
    }
}