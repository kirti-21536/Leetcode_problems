// Last updated: 4/28/2026, 11:15:59 AM
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3        int[] freq = new int[26];
4        for (char task : tasks) {
5            freq[task - 'A']++;
6        }
7        
8        int maxFreq = 0;
9        for (int f : freq) {
10            maxFreq = Math.max(maxFreq, f);
11        }
12        
13        int countMax = 0;
14        for (int f : freq) {
15            if (f == maxFreq) countMax++;
16        }
17        
18        int result = (maxFreq - 1) * (n + 1) + countMax;
19        
20        return Math.max(tasks.length, result);
21    }
22}