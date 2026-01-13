// Last updated: 1/13/2026, 11:11:22 AM
class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        char a=pattern.charAt(0);
        char b=pattern.charAt(1);
        long counta=0,countb=0,c=0;
        for(char ch:text.toCharArray()){
            if(ch==b)c+=counta;
            if(ch==a)counta++;
            if(ch==b)countb++;
        }
        return Math.max(c+countb,c+counta);   
    }
}