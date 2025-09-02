// Last updated: 9/3/2025, 2:06:17 AM
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        
        if (s.equals(goal)) {
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
                if (freq[c - 'a'] > 1) {
                    return true;
                }
            }
            return false; 
        }
        int f = -1, t = -1, diff = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff++;
                if (f == -1) {
                    f = i;
                } else if (t == -1) {
                    t = i;
                } else {
                    return false; 
                }
            }
        }
        
        if(diff == 2 && s.charAt(f) == goal.charAt(t) && s.charAt(t) == goal.charAt(f)) return true;
        
        return false;
    }
}