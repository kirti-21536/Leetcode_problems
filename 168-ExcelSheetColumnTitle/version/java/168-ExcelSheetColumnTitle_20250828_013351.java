// Last updated: 8/28/2025, 1:33:51 AM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder st = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int r=columnNumber%26;
            st.append((char)('A'+r));
            columnNumber/=26;
        }
        return st.reverse().toString();
        
    }
}