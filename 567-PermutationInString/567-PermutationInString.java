// Last updated: 1/13/2026, 11:15:46 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int win_size=s1.length();
        int i=0;
        while(i<=s2.length()-win_size){
            Map <Character,Integer> map1=new HashMap<>();
            for(int k=i;k<i+win_size;k++){
                char ch=s2.charAt(k);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
            }   
            
            if(map.equals(map1))return true;
        i++;
        }
      return false;       
    }
}