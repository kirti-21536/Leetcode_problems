// Last updated: 9/22/2025, 12:26:39 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums1) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> List = new ArrayList<>();
        for (int num : nums2) {
            if (count.containsKey(num) && count.get(num) > 0) {
                List.add(num);
                count.put(num, count.get(num) - 1);
            }
        }
        int[] result = new int[List.size()];
        for (int i = 0; i < List.size(); i++) {
            result[i] = List.get(i);
        }

        return result;

        
    }
}