// Last updated: 6/13/2026, 10:50:14 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder ans = new StringBuilder();
4
5        for (String word : words) {
6            int sum = 0;
7            for (char ch : word.toCharArray()) {
8                sum += weights[ch - 'a'];
9            }
10            int mod = sum % 26;
11            char mapped = (char) ('z' - mod);
12
13            ans.append(mapped);
14        }
15        return ans.toString();
16    }
17}