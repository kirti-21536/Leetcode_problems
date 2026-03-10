// Last updated: 3/10/2026, 10:48:51 AM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int islands = 0;
4        for(int i=0; i<grid.length; i++){
5            for(int j=0; j<grid[0].length; j++){
6                if(grid[i][j]=='1'){
7                    islands++;
8                    check(grid,i,j);
9                }
10            }
11        }
12
13        return islands;
14    }
15
16    public static void check(char[][] grid, int i, int j){
17        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
18            return;
19        }
20
21        grid[i][j] = '0';
22
23        check(grid,i+1,j);
24        check(grid,i-1,j);
25        check(grid,i,j+1);
26        check(grid,i,j-1);
27    }
28}