// Last updated: 1/13/2026, 11:14:53 AM
class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        } 

        for (int n : nums) {
            if (freq.get(n) == 0) continue;

            if (map.getOrDefault(n, 0) > 0) {
                map.put(n, map.get(n) - 1);
                map.put(n + 1, map.getOrDefault(n + 1, 0) + 1);
            } 
            else if (freq.getOrDefault(n + 1, 0) > 0 && freq.getOrDefault(n + 2, 0) > 0) {
                freq.put(n + 1, freq.get(n + 1) - 1);
                freq.put(n + 2, freq.get(n + 2) - 1);
                map.put(n + 3, map.getOrDefault(n + 3, 0) + 1);
            }
            
             else return false;

            freq.put(n, freq.get(n) - 1);
        }
        return true;
        
    }
}