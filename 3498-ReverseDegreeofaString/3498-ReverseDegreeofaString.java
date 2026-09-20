// Last updated: 9/20/2026, 12:35:31 PM
1class Solution {
2    public int reverseDegree(String s) {
3        int sum=0;
4        for (int i = 0; i < s.length(); i++) {
5            int reverse = 26 - (s.charAt(i) - 'a');
6            sum += reverse * (i + 1);
7        }
8        return sum;
9        
10    }
11}