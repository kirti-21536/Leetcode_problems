// Last updated: 10/22/2026, 7:00:48 PM
1
2class Solution {
3    public int minOperations(int[] nums) {
4        int n = nums.length;
5        int zero = 0;
6
7        for (int i = 0; i < n; i++) {
8            if (nums[i] == 0) {
9                zero = i;
10                break;
11            }
12        }
13
14        int ans = Integer.MAX_VALUE;
15
16        for (int step : new int[]{1, -1}) {
17            boolean valid = true;
18
19            for (int i = 1; i < n; i++) {
20                int prev = (zero + (i - 1) * step + n) % n;
21                int curr = (zero + i * step + n) % n;
22
23                if (nums[prev] > nums[curr]) {
24                    valid = false;
25                    break;
26                }
27            }
28
29            if (valid) {
30                if (step == 1) {
31                    ans = Math.min(ans, zero);
32                    ans = Math.min(ans, n - zero + 2);
33                } else {
34                    ans = Math.min(ans, zero + 2);
35                    ans = Math.min(ans, n - zero);
36                }
37            }
38        }
39
40        return ans == Integer.MAX_VALUE ? -1 : ans;
41    }
42}
43