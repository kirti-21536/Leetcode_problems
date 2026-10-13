// Last updated: 10/13/2026, 10:54:53 PM
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        int n = nums.length;
4        long[] squares = new long[n];
5
6        for (int i = 0; i < n; i++) {
7            squares[i] = (long) nums[i] * nums[i];
8        }
9
10        Arrays.sort(squares);
11
12        long ans = 0;
13
14        for (int i = 0; i < n; i++) {
15            if (i < n / 2) {
16                ans -= squares[i];
17            } else {
18                ans += squares[i];
19            }
20        }
21
22        return ans;
23    }
24}
25