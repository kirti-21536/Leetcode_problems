// Last updated: 5/3/2026, 3:50:34 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        return s.length() == goal.length() && (s + s).contains(goal);
4    }
5}