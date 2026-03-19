// Last updated: 3/19/2026, 2:55:15 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int count=0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[0].length;j++){
6                if(grid[i][j]=='1'){
7                    dfs(grid,i,j);
8                    count++;
9                }
10            }
11        }
12        return count;
13        
14    }
15    public void dfs(char grid[][],int i,int j){
16        if(i>=grid.length ||i<0 || j<0 || j>=grid[0].length || grid[i][j]=='0'){
17            return;
18        }
19        grid[i][j]='0';
20        dfs(grid,i+1,j);
21        dfs(grid,i-1,j);
22        dfs(grid,i,j+1);
23        dfs(grid,i,j-1);
24    }
25}