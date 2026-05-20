// Last updated: 5/20/2026, 8:00:02 PM
1class Solution {
2
3    public int getSum(int a, int b) {
4
5        while (b != 0) {
6
7            int carry = (a & b) << 1;
8
9            a = a ^ b;
10
11            b = carry;
12        }
13
14        return a;
15    }
16}