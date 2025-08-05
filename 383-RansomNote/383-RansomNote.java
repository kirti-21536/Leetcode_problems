// Last updated: 8/6/2025, 12:40:16 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> freqMap=new HashMap<>();
        for(char ch:magazine.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        for(char ch:ransomNote.toCharArray()){
            if(!freqMap.containsKey(ch) || freqMap.get(ch)==0){
                return false;
            }
            freqMap.put(ch,freqMap.get(ch)-1);        }
        return true;


    }
}