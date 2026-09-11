// Last updated: 9/11/2026, 10:05:58 PM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        int[] freq = new int[10];
4
5        for (int d : digits) {
6            freq[d]++;
7        }
8
9        int count = 0;
10
11        for (int num = 100; num <= 999; num++) {
12            if (num % 2 != 0) continue;
13
14            int a = num / 100;
15            int b = (num / 10) % 10;
16            int c = num % 10;
17
18            int[] used = new int[10];
19            used[a]++;
20            used[b]++;
21            used[c]++;
22
23            boolean possible = true;
24
25            for (int d = 0; d <= 9; d++) {
26                if (used[d] > freq[d]) {
27                    possible = false;
28                    break;
29                }
30            }
31
32            if (possible) count++;
33        }
34
35        return count;
36    }
37}