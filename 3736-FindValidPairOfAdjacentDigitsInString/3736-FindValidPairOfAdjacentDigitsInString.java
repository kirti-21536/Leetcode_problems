// Last updated: 8/1/2025, 8:14:05 PM
class Solution {
    public String findValidPair(String s) {
        int freq[]=new int[10];
        for(char c:s.toCharArray()){
            freq[c-'0']++;
        }
        
        for(int i=0;i<s.length()-1;i++){
            int f=s.charAt(i)-'0';
            int sec=s.charAt(i+1)-'0';
            if(f!=sec && freq[f]==f && freq[sec]==sec){
                return ""+f+sec;
            }
        }
        return "";
    }
}