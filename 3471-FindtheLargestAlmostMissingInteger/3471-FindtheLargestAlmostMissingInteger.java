// Last updated: 8/18/2026, 12:26:55 PM
1class Solution {
2    public int largestInteger(int[] nums, int k) {
3        int n = nums.length;
4        int[] count = new int[51];
5        for (int i = 0; i <= n - k; i++) {
6            boolean[] seen = new boolean[51];
7            for (int j = i; j < i + k; j++) {
8                if (!seen[nums[j]]) {
9                    count[nums[j]]++;
10                    seen[nums[j]] = true;
11                }
12            }
13        }
14        int ans = -1;
15        for (int i = 50; i >= 0; i--) {
16            if (count[i] == 1) {
17                return i;
18            }
19        }
20        return ans;
21    }
22}