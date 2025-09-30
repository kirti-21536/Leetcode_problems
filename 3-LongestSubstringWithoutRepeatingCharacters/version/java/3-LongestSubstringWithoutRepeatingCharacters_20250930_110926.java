// Last updated: 9/30/2025, 11:09:26 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0;
        int max_len=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            max_len=Math.max(max_len,i-left+1);
        }

        return max_len;
    }    
}