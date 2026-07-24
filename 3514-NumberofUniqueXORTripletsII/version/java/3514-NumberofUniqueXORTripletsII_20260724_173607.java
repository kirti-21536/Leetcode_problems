// Last updated: 7/24/2026, 5:36:07 PM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int max = 0;
4        for (int x : nums) {
5            max = Math.max(max, x);
6        }
7        int size = 1;
8        while (size <= max) {
9            size <<= 1;
10        }
11        boolean[] pair = new boolean[size];
12        boolean[] ans = new boolean[size];
13        int n = nums.length;
14        for (int i = 0; i < n; i++) {
15            for (int j = i; j < n; j++) {
16                pair[nums[i] ^ nums[j]] = true;
17            }
18        }
19        for (int xor = 0; xor < size; xor++) {
20            if (!pair[xor]) continue;
21
22            for (int x : nums) {
23                ans[xor ^ x] = true;
24            }
25        }
26        int count = 0;
27        for (boolean possible : ans) {
28            if (possible) {
29                count++;
30            }
31        }
32
33        return count;
34    }
35}