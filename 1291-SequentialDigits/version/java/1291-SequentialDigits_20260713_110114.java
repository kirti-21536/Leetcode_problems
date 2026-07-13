// Last updated: 7/13/2026, 11:01:14 AM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3        List<Integer> ans = new ArrayList<>();
4        String digits = "123456789";
5
6        for (int len = 2; len <= 9; len++) {
7            for (int i = 0; i + len <= 9; i++) {
8                int num = Integer.parseInt(digits.substring(i, i + len));
9
10                if (num >= low && num <= high) {
11                    ans.add(num);
12                }
13            }
14        }
15
16        return ans;
17    }
18}