// Last updated: 3/12/2026, 3:01:03 PM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int original=image[sr][sc];
4        dfs(image,original,sr,sc,color);
5        return image;
6    }
7    public void dfs(int[][] image,int original,int i,int j,int color){
8        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]==color || image[i][j]!=original){
9            return ;
10        }
11        image[i][j]=color;
12        dfs(image,original,i+1,j,color);
13        dfs(image,original,i-1,j,color);
14        dfs(image,original,i,j+1,color);
15        dfs(image,original,i,j-1,color);
16    }
17
18}