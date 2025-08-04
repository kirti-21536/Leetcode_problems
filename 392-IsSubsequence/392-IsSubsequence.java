// Last updated: 8/5/2025, 12:22:24 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
       int i=0;
       int j=0;
       int unique=0;
       while(i<t.length() && j<s.length()){
        if(t.charAt(i)==s.charAt(j)){
            i++;
            j++;
            unique++;
        }
        else{
            i++;
        }  
       }
       if(unique==s.length()){
            return true;
        }
        return false;
        
    }
}