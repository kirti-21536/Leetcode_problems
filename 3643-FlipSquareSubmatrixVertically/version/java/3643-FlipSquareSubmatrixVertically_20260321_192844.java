// Last updated: 3/21/2026, 7:28:44 PM
1class Solution {
2    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
3        int m=x+k-1;
4        int i=x;
5        while(i<m){
6            for(int j=y;j<y+k;j++){
7                int temp=grid[i][j];
8                grid[i][j]=grid[m][j];
9                grid[m][j]=temp;
10            }
11            i++;
12            m--;
13        }
14        return grid;
15    }
16}