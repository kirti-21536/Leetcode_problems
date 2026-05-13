// Last updated: 5/14/2026, 12:16:09 AM
1class Solution {
2    public int minMoves(int[] nums, int limit) {
3        int n = nums.length;
4
5        int[] diff = new int[2 * limit + 2];
6
7        for (int i = 0; i < n / 2; i++) {
8
9            int a = nums[i];
10            int b = nums[n - 1 - i];
11
12            int low = Math.min(a, b) + 1;
13            int high = Math.max(a, b) + limit;
14
15            int sum = a + b;
16          
17            diff[2] += 2;
18            diff[2 * limit + 1] -= 2;
19
20            diff[low] -= 1;
21            diff[high + 1] += 1;
22
23            diff[sum] -= 1;
24            diff[sum + 1] += 1;
25        }
26
27        int ans = Integer.MAX_VALUE;
28        int curr = 0;
29
30        for (int s = 2; s <= 2 * limit; s++) {
31            curr += diff[s];
32            ans = Math.min(ans, curr);
33        }
34
35        return ans;
36    }
37}