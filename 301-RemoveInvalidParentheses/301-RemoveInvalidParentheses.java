// Last updated: 10/7/2026, 3:50:54 PM
1class Solution {
2    List<String> ans = new ArrayList<>();
3    public List<String> removeInvalidParentheses(String s) {
4        int leftRemove = 0;
5        int rightRemove = 0;
6        for (char ch : s.toCharArray()) {
7            if (ch == '(') {
8                leftRemove++;
9            } else if (ch == ')') {
10                if (leftRemove > 0) {
11                    leftRemove--;
12                } else {
13                    rightRemove++;
14                }
15            }
16        }
17
18        backtrack(s, 0, 0, 0, leftRemove, rightRemove, "");
19
20        return ans;
21    }
22
23    private void backtrack(String s, int index, int left, int right,
24                           int leftRemove, int rightRemove, String current) {
25
26        if (index == s.length()) {
27            if (leftRemove == 0 && rightRemove == 0 && left == right) {
28                if (!ans.contains(current)) {
29                    ans.add(current);
30                }
31            }
32            return;
33        }
34
35        char ch = s.charAt(index);
36
37        if (ch == '(' && leftRemove > 0) {
38            backtrack(s, index + 1, left, right,
39                    leftRemove - 1, rightRemove, current);
40        }
41
42        if (ch == ')' && rightRemove > 0) {
43            backtrack(s, index + 1, left, right,
44                    leftRemove, rightRemove - 1, current);
45        }
46
47        if (ch != '(' && ch != ')') {
48            backtrack(s, index + 1, left, right,
49                    leftRemove, rightRemove, current + ch);
50        } else if (ch == '(') {
51            backtrack(s, index + 1, left + 1, right,
52                    leftRemove, rightRemove, current + ch);
53        } else if (right < left) {
54            backtrack(s, index + 1, left, right + 1,
55                    leftRemove, rightRemove, current + ch);
56        }
57    }
58}