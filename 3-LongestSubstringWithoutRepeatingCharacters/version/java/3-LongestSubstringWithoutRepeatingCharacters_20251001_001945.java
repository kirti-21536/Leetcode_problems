// Last updated: 10/1/2025, 12:19:45 AM
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