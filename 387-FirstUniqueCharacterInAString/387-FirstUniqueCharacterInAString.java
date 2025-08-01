// Last updated: 8/1/2025, 8:14:58 PM
class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[26];
        char chars[]= new char[s.length()];
        for(int i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        for(int j=0;j<chars.length;j++){
            freq[(int)chars[j]-97]++;
        }
        for(int k=0;k<chars.length;k++){
            if(freq[(int)chars[k]-97]==1){
                return k;
            }
        }
        return -1;
    }
}