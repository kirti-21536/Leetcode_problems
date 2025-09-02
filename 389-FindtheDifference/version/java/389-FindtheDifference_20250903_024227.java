// Last updated: 9/3/2025, 2:42:27 AM
class Solution {
    public char findTheDifference(String s, String t) {
        // ASCII SUM
        int sumS = 0, sumT = 0;
        for (char c : s.toCharArray()) sumS += c;
        for (char c : t.toCharArray()) sumT += c;
        return (char)(sumT - sumS);

        // using xor
        // char ans = 0;
        // for (char c : s.toCharArray()) ans ^= c;
        // for (char c : t.toCharArray()) ans ^= c;
        // return ans;
        
    }
}