// Last updated: 11/24/2026, 3:32:18 PM
1class Solution {
2    public int maxLength(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5
6        for (int i = 0; i < n; i++) {
7            long prod = 1;
8            int g = 0;
9            int l = 1;
10
11            for (int j = i; j < n; j++) {
12                prod *= nums[j];
13
14                g = gcd(g, nums[j]);
15                l = l / gcd(l, nums[j]) * nums[j];
16
17                if (prod == (long) g * l) {
18                    ans = Math.max(ans, j - i + 1);
19                }
20            }
21        }
22
23        return ans;
24    }
25
26    private int gcd(int a, int b) {
27        while (b != 0) {
28            int temp = b;
29            b = a % b;
30            a = temp;
31        }
32        return a;
33    }
34}
35