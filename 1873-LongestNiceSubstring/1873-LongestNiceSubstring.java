// Last updated: 1/13/2026, 11:11:56 AM
class Solution {
    public String longestNiceSubstring(String s) {
        Set<Character> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(set.contains(Character.toLowerCase(ch))
            &&set.contains(Character.toUpperCase(ch))){
                continue;
            }
            String ans_left=longestNiceSubstring(s.substring(0,i));
            String ans_right=longestNiceSubstring(s.substring(i+1));

            return ans_left.length()>=ans_right.length()?ans_left:ans_right;
        }
        return s;
        
    }
}