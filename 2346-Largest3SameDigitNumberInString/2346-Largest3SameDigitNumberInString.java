// Last updated: 8/14/2025, 11:37:32 PM
class Solution {
    public String largestGoodInteger(String num) {
       String max = "";
    
    for (int i = 0; i <= num.length() - 3; i++) {
        char c1 = num.charAt(i);
        char c2 = num.charAt(i + 1);
        char c3 = num.charAt(i + 2);
        
        if (c1 == c2 && c2 == c3) {   // found a good integer
            String ans= num.substring(i, i + 3);
            if (max.equals("") || ans.compareTo(max) > 0) {
                max = ans;
            }
        }
    }
    
    return max;
        
    }
}