// Last updated: 12/1/2025, 1:30:32 AM
1class Solution {
2    public String getHint(String secret, String guess) {
3        int bulls = 0, cows = 0;
4        int[] count = new int[10];
5
6        for (int i = 0; i < secret.length(); i++) {
7            char s = secret.charAt(i);
8            char g = guess.charAt(i);
9
10            if (s == g) {
11                bulls++;
12            } else {
13                if (count[s - '0'] < 0) cows++;
14                if (count[g - '0'] > 0) cows++;
15
16                count[s - '0']++;
17                count[g - '0']--;
18            }
19        }
20
21        return bulls + "A" + cows + "B";
22    }
23}
24