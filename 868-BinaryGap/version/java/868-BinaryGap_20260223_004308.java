// Last updated: 2/23/2026, 12:43:08 AM
1class Solution {
2    public int binaryGap(int n) {
3        int last = -1;   // position of last seen 1
4        int maxGap = 0;
5        int index = 0;
6        
7        while (n > 0) {
8            if ((n & 1) == 1) {   // if last bit is 1
9                if (last != -1) {
10                    maxGap = Math.max(maxGap, index - last);
11                }
12                last = index;
13            }
14            n = n >> 1;  // right shift
15            index++;
16        }
17        
18        return maxGap;
19    }
20}