// Last updated: 7/12/2026, 7:15:40 PM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int[] sorted = arr.clone();
4        Arrays.sort(sorted);
5        Map<Integer, Integer> rank = new HashMap<>();
6        int r = 1;
7        for (int num : sorted) {
8            if (!rank.containsKey(num)) {
9                rank.put(num, r++);
10            }
11        }
12
13        int[] ans = new int[arr.length];
14        for (int i = 0; i < arr.length; i++) {
15            ans[i] = rank.get(arr[i]);
16        }
17
18        return ans;
19        
20    }
21}