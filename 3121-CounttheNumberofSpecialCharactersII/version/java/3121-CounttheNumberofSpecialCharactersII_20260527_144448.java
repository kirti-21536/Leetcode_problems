// Last updated: 5/27/2026, 2:44:48 PM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        int[] lastLower = new int[26];
4        int[] firstUpper = new int[26];
5        Arrays.fill(lastLower, -1);
6        Arrays.fill(firstUpper, -1);
7        for (int i = 0; i < word.length(); i++) {
8            char ch = word.charAt(i);
9            if (Character.isLowerCase(ch)) {
10                lastLower[ch - 'a'] = i;
11            } else {
12                int idx = ch - 'A';
13                if (firstUpper[idx] == -1) {
14                    firstUpper[idx] = i;
15                }
16            }
17        }
18        int count = 0;
19        for (int i = 0; i < 26; i++) {
20            if (lastLower[i] != -1 &&
21                firstUpper[i] != -1 &&
22                lastLower[i] < firstUpper[i]) {
23
24                count++;
25            }
26        }
27        return count;
28    }
29}