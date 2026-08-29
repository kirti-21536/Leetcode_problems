// Last updated: 8/29/2026, 11:23:30 AM
1class Solution {
2    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
3        int n = nums.length;
4        int[][] arr = new int[n][2];
5        for (int i = 0; i < n; i++) {
6            arr[i][0] = nums[i];
7            arr[i][1] = i;
8        }
9        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
10        int[] ans = new int[n];
11        int i = 0;
12
13        while (i < n) {
14            int j = i;
15            while (j + 1 < n &&
16                   arr[j + 1][0] - arr[j][0] <= limit) {
17                j++;
18            }
19
20            int[] indices = new int[j - i + 1];
21            for (int k = i; k <= j; k++) {
22                indices[k - i] = arr[k][1];
23            }
24
25            Arrays.sort(indices);
26            for (int k = 0; k < indices.length; k++) {
27                ans[indices[k]] = arr[i + k][0];
28            }
29
30            i = j + 1;
31        }
32
33        return ans;
34    }
35}