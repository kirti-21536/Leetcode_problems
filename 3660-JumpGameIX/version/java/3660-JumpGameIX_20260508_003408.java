// Last updated: 5/8/2026, 12:34:08 AM
1class Solution {
2    public int[] maxValue(int[] nums) {
3        int n = nums.length;
4        int[] prefixMax = new int[n];
5        int[] suffixMin = new int[n];
6
7        prefixMax[0] = nums[0];
8
9        for (int i = 1; i < n; i++) {
10            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
11        }
12
13        suffixMin[n - 1] = nums[n - 1];
14
15        for (int i = n - 2; i >= 0; i--) {
16            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
17        }
18
19        int[] ans = new int[n];
20        int start = 0;
21        for (int i = 0; i < n - 1; i++) {
22            if (prefixMax[i] <= suffixMin[i + 1]) {
23
24                int mx = prefixMax[i];
25
26                for (int j = start; j <= i; j++) {
27                    ans[j] = mx;
28                }
29
30                start = i + 1;
31            }
32        }
33
34        int mx = prefixMax[n - 1];
35        for (int j = start; j < n; j++) {
36            ans[j] = mx;
37        }
38
39        return ans;
40    }
41}