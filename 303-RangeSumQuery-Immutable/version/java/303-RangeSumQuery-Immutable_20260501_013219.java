// Last updated: 5/1/2026, 1:32:19 AM
1class NumArray {
2
3    private int[] prefix;
4
5    public NumArray(int[] nums) {
6        int n = nums.length;
7        prefix = new int[n + 1];
8
9        for (int i = 0; i < n; i++) {
10            prefix[i + 1] = prefix[i] + nums[i];
11        }
12    }
13
14    public int sumRange(int left, int right) {
15        return prefix[right + 1] - prefix[left];
16    }
17}
18
19/**
20 * Your NumArray object will be instantiated and called as such:
21 * NumArray obj = new NumArray(nums);
22 * int param_1 = obj.sumRange(left,right);
23 */