// Last updated: 8/1/2026, 12:01:25 AM
class Solution {
    public int firstMatchingIndex(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                return i;
            }
            i++;
            j--;
        }
        return -1;
        
    }
}