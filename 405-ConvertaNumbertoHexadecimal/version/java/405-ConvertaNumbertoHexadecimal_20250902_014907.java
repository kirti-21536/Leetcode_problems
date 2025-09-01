// Last updated: 9/2/2025, 1:49:07 AM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        String hexDigits = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();
        
        while (num != 0) {
            sb.append(hexDigits.charAt(num & 15)); 
            num >>>= 4; 
        }
        
        return sb.reverse().toString();
        
    }
}