// Last updated: 4/11/2026, 8:43:00 PM
1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int count = 0;
4        for (int num : nums) {
5            while (num > 0) {
6                if (num % 10 == digit) {
7                    count++;
8                }
9                num /= 10;
10            }
11        }
12        
13        return count;
14        
15    }
16}