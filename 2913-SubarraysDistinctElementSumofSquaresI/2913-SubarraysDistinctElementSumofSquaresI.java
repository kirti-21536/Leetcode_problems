// Last updated: 10/15/2026, 11:55:50 PM
1class Solution {
2    public int sumCounts(List<Integer> nums) {
3        int n = nums.size();
4        int ans = 0;
5
6        for (int i = 0; i < n; i++) {
7            Set<Integer> set = new HashSet<>();
8
9            for (int j = i; j < n; j++) {
10                set.add(nums.get(j));
11                ans += set.size() * set.size();
12            }
13        }
14
15        return ans;
16    }
17}
18