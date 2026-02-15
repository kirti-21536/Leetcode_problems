// Last updated: 2/16/2026, 1:23:29 AM
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder result = new StringBuilder();
4        int i = a.length() - 1, j = b.length() - 1, carry = 0;
5
6        while (i >= 0 || j >= 0 || carry == 1) {
7            int sum = carry;
8            if (i >= 0) 
9            sum += a.charAt(i--) - '0';
10            if (j >= 0)
11            sum += b.charAt(j--) - '0';
12
13            result.append(sum % 2); // 0 or 1
14            carry = sum / 2;        // 0 or 1
15        }
16
17        return result.reverse().toString();
18
19                }
20
21            }