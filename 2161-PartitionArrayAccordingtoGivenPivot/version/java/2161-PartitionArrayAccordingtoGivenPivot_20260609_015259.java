// Last updated: 6/9/2026, 1:52:59 AM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        List<Integer> ans = new ArrayList<>();
4
5        for (int num : nums) {
6            if (num < pivot) {
7                ans.add(num);
8            }
9        }
10
11        for (int num : nums) {
12            if (num == pivot) {
13                ans.add(num);
14            }
15        }
16
17        for (int num : nums) {
18            if (num > pivot) {
19                ans.add(num);
20            }
21        }
22
23        int[] res = new int[nums.length];
24
25        for (int i = 0; i < nums.length; i++) {
26            res[i] = ans.get(i);
27        }
28
29        return res;
30    }
31}