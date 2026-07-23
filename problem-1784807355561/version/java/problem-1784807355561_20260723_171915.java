// Last updated: 7/23/2026, 5:19:15 PM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4        if (n < 3) return n;
5        int ans = 1;
6        while (ans <= n) {
7            ans <<= 1;
8        }
9
10        return ans;
11        
12    }
13}