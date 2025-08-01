// Last updated: 8/1/2025, 8:15:07 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String st[]=s.split(" ");
        if(st.length!=pattern.length())return false;
        HashMap<Character,String> map_chr= new HashMap<>();
        HashMap<String,Character> map_str= new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=st[i];

           if(map_chr.containsKey(c)){
            if(!map_chr.get(c).equals(word)){
                return false;
            }
           }
           else if(map_str.containsKey(word)){
            if(map_str.get(word)!=c){
                return false;
            }
           }
           else{
            map_chr.put(c,word);
            map_str.put(word,c);
           }
        }
        return true;
    }
}