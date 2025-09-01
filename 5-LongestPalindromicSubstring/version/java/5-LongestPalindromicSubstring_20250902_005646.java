// Last updated: 9/2/2025, 12:56:46 AM
class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int st = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l > end - st) {
                    st = l;
                    end = r;
                }
                l--;
                r++;
            }

            // Even length palindrome
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l > end - st) {
                    st = l;
                    end = r;
                }
                l--;
                r++;
            }
        }

        return s.substring(st, end + 1);
        
    }
}