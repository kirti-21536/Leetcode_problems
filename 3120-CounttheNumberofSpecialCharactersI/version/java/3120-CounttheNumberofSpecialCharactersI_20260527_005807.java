// Last updated: 5/27/2026, 12:58:07 AM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        HashSet<Character> lower = new HashSet<>();
4        HashSet<Character> upper = new HashSet<>();
5        for (char ch : word.toCharArray()) {
6            if (Character.isLowerCase(ch)) {
7                lower.add(ch);
8            } else {
9                upper.add(ch);
10            }
11        }
12        int count = 0;
13        for (char ch : lower) {
14            if (upper.contains(Character.toUpperCase(ch))) {
15                count++;
16            }
17        }
18        return count;
19    }
20}