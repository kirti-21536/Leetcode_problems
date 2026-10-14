// Last updated: 10/14/2026, 12:12:20 PM
1class Solution {
2    public String maxSumOfSquares(int num, int sum) {
3        if (sum > num * 9) {
4            return "";
5        }
6
7        StringBuilder ans = new StringBuilder();
8
9        int count = sum / 9;
10        int rem = sum % 9;
11
12        ans.append("9".repeat(count));
13
14        if (rem > 0) {
15            ans.append(rem);
16        }
17
18        while (ans.length() < num) {
19            ans.append('0');
20        }
21
22        return ans.toString();
23    }
24}
25