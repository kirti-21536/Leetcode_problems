// Last updated: 8/1/2026, 12:01:57 AM
import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        if (n < 3) return -1;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int min = Integer.MAX_VALUE;
        for (List<Integer> list : map.values()) {
            if (list.size() < 3) continue;

            for (int i = 0; i <= list.size() - 3; i++) {
                int a = list.get(i);
                int c = list.get(i + 2);
                int dist = 2 * (c - a);
                min = Math.min(min, dist);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}