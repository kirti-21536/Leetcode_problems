// Last updated: 7/18/2026, 11:41:05 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        int min = Integer.MAX_VALUE;
4        int max = Integer.MIN_VALUE;
5
6        for (int num : nums) {
7            min = Math.min(min, num);
8            max = Math.max(max, num);
9        }
10
11        return gcd(min, max);
12    }
13
14    private int gcd(int a, int b) {
15        while (b != 0) {
16            int temp = b;
17            b = a % b;
18            a = temp;
19        }
20        return a;
21
22        
23    }
24}