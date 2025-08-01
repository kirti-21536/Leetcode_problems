// Last updated: 8/1/2025, 8:15:30 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            if (mapST.containsKey(schar)){
            if(mapST.get(schar)!=tchar){
                return false;
            }
            }
            else{
                if(mapTS.containsKey(tchar)){
                    return false;
                }
                    mapST.put(schar, tchar);
                    mapTS.put(tchar, schar);
            }
        }
        return true;
        
    }
}