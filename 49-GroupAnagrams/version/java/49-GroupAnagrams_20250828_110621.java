// Last updated: 8/28/2025, 11:06:21 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list= new ArrayList<>();
        if(strs==null || strs.length==0)return list;  

        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count); //unique key for each anagram
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        list.addAll(map.values());
        return list;

        
    }
}