// Last updated: 9/3/2025, 1:40:51 AM
class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)return 1;
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        int length = 0;
        boolean odd = false;
        
        for (int c: freq.values()) {
            if (c % 2 == 0) {
                length += c;
            } else {
                length += c - 1;  
                odd = true;
            }
        }
        if (odd) {
            length += 1;
        }
        
        return length;
        
    }
}