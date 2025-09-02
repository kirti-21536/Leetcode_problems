// Last updated: 9/3/2025, 1:51:52 AM
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last= new HashMap<>();
        
        int d = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            map.put(n, map.getOrDefault(n, 0) + 1);
            d = Math.max(d, map.get(n));

            if (!first.containsKey(n)) {
                first.put(n, i);
            }
            last.put(n, i);
        }
        
        int min= nums.length;
        
        for (int n : map.keySet()) {
            if (map.get(n) == d) {
                int length = last.get(n) - first.get(n) + 1;
                min = Math.min(min, length);
            }
        }
        
        return min;
    }
}