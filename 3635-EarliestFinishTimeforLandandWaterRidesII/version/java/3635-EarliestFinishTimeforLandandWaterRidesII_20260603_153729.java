// Last updated: 6/3/2026, 3:37:29 PM
1import java.util.*;
2
3class Solution {
4    public int minimumCost(int[] cost) {
5        Arrays.sort(cost);
6
7        int ans = 0;
8        int count = 0;
9
10        for (int i = cost.length - 1; i >= 0; i--) {
11            count++;
12
13            if (count == 3) {
14                count = 0; // free candy
15                continue;
16            }
17
18            ans += cost[i];
19        }
20
21        return ans;
22    }
23}