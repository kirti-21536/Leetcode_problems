// Last updated: 8/28/2025, 1:37:41 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        for(int i=0;i<columnTitle.length();i++){
            char c=columnTitle.charAt(i);
            int value=c-'A'+1;
            result=result*26+value;
        }
        return result;
        
    }
}