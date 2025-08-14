// Last updated: 8/14/2025, 11:37:43 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
           map.put(i, map.getOrDefault(i, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int freq : map.values()){
            if(!set.add(freq)) return false;  // duplicate frequency found
        }
        return true;

    }
}