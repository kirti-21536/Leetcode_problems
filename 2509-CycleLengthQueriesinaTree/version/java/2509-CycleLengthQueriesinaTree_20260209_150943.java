// Last updated: 2/9/2026, 3:09:43 PM
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        int m = queries.length;
4        int[] ans = new int[m];
5        
6        for (int i = 0; i < m; i++) {
7            int a = queries[i][0];
8            int b = queries[i][1];
9            int steps = 0;
10            
11            while (a != b) {
12                if (a > b) a /= 2;
13                else b /= 2;
14                steps++;
15            }
16            
17            ans[i] = steps + 1; // +1 because adding edge makes a cycle
18        }
19        
20        return ans;
21        
22    }
23}