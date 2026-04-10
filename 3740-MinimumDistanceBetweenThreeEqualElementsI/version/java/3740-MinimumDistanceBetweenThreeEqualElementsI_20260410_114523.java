// Last updated: 4/10/2026, 11:45:23 AM
1import java.util.*;
2
3class Solution {
4    public int minimumDistance(int[] nums) {
5        int n = nums.length;
6        if (n < 3) return -1;
7
8        Map<Integer, List<Integer>> map = new HashMap<>();
9        for (int i = 0; i < n; i++) {
10            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
11        }
12        int min = Integer.MAX_VALUE;
13        for (List<Integer> list : map.values()) {
14            if (list.size() < 3) continue;
15
16            for (int i = 0; i <= list.size() - 3; i++) {
17                int a = list.get(i);
18                int c = list.get(i + 2);
19                int dist = 2 * (c - a);
20                min = Math.min(min, dist);
21            }
22        }
23        return min == Integer.MAX_VALUE ? -1 : min;
24    }
25}