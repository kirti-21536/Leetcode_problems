// Last updated: 10/12/2026, 2:06:38 PM
1class Solution {
2    public int maxSum(List<Integer> nums, int k) {
3        int[] bits = new int[31];
4
5        for (int num : nums) {
6            for (int i = 0; i < 31; i++) {
7                if ((num & (1 << i)) != 0) {
8                    bits[i]++;
9                }
10            }
11        }
12
13        long ans = 0;
14        int mod = 1_000_000_007;
15
16        for (int j = 0; j < k; j++) {
17            long num = 0;
18
19            for (int i = 30; i >= 0; i--) {
20                if (bits[i] > 0) {
21                    num |= (1L << i);
22                    bits[i]--;
23                }
24            }
25
26            ans = (ans + num * num) % mod;
27        }
28
29        return (int) ans;
30    }
31}