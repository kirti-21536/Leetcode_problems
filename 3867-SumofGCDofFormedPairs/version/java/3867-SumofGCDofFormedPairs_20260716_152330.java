// Last updated: 7/16/2026, 3:23:30 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int n = nums.length;
4        int[] prefixGcd = new int[n];
5
6        int mx = 0;
7        for (int i = 0; i < n; i++) {
8            mx = Math.max(mx, nums[i]);
9            prefixGcd[i] = gcd(nums[i], mx);
10        }
11
12        Arrays.sort(prefixGcd);
13
14        long ans = 0;
15        for (int i = 0; i < n / 2; i++) {
16            ans += gcd(prefixGcd[i], prefixGcd[n - 1 - i]);
17        }
18
19        return ans;
20    }
21
22    private int gcd(int a, int b) {
23        while (b != 0) {
24            int t = a % b;
25            a = b;
26            b = t;
27        }
28        return a;
29        
30    }
31}