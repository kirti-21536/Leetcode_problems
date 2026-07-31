// Last updated: 8/1/2026, 12:01:10 AM
class Solution {
    public int mirrorFrequency(String s) {
        int letter[]=new int[26];
        int digit[]=new int[10];
        for(char ch:s.toCharArray()){
            if(ch>='0'&& ch<='9'){
                digit[ch-'0']++;
            }
            else {
                letter[ch-'a']++;
            }
        }
        int sum=0;
        for(int i=0;i<13;i++){
            sum+=Math.abs(letter[i]-letter[25-i]);
        }
        for(int i=0;i<5;i++){
            sum+=Math.abs(digit[i]-digit[9-i]);
        }
        
        return sum;    
}
}