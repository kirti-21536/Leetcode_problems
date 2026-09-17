// Last updated: 9/17/2026, 4:13:31 PM
1class Solution {
2    public int minSumOfLengths(int[] arr, int target) {
3        int n = arr.length;
4        int[] left = new int[n];
5        int INF = Integer.MAX_VALUE;
6
7        int sum = 0, l = 0, best = INF;
8
9        for (int r = 0; r < n; r++) {
10            sum += arr[r];
11
12            while (sum > target) {
13                sum -= arr[l++];
14            }
15
16            if (sum == target) {
17                best = Math.min(best, r - l + 1);
18            }
19
20            left[r] = best;
21        }
22
23        sum = 0;
24        l = 0;
25        int ans = INF;
26
27        for (int r = 0; r < n; r++) {
28            sum += arr[r];
29
30            while (sum > target) {
31                sum -= arr[l++];
32            }
33
34            if (sum == target && l > 0 && left[l - 1] != INF) {
35                ans = Math.min(ans, r - l + 1 + left[l - 1]);
36            }
37        }
38
39        return ans == INF ? -1 : ans;
40    }
41}