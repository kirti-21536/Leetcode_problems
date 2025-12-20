// Last updated: 12/20/2025, 11:56:11 PM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) sb.append(ch);
                depth++;
            } else {
                depth--;
                if (depth > 0) sb.append(ch);
            }
        }
        return sb.toString();
    }
}
