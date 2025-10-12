// Last updated: 10/12/2025, 10:59:32 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int left=0;
        int maxf=0;
        int maxl=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'A']++;
            maxf=Math.max(maxf,freq[ch-'A']);
            while((i-left+1)-maxf>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxl=Math.max(maxl,i-left+1);
        }
        return maxl;
        }
}