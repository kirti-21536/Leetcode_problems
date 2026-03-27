// Last updated: 3/27/2026, 11:43:49 PM
1class Solution {
2    public boolean areSimilar(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5        k = k % n;
6        for (int i = 0; i < m; i++) {
7            for (int j = 0; j < n; j++) {
8                
9                int newCol;
10                
11                if (i % 2 == 0) {
12                    //right shift
13                    newCol = (j - k + n) % n;
14                } else {
15                    //left shift
16                    newCol = (j + k) % n;
17                }
18                
19                if (grid[i][j] != grid[i][newCol]) {
20                    return false;
21                }
22            }
23        }
24        
25        return true;
26    }
27}