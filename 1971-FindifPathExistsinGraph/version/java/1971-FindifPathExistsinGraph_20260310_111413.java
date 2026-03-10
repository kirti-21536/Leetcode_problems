// Last updated: 3/10/2026, 11:14:13 AM
1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        if(image[sr][sc]==color)return image;
4        dfs(image,sr,sc,image[sr][sc],color);
5        return image;
6    }
7    public void dfs(int[][] image,int i,int j,int src_color,int color){
8        if(i<0 || j<0 ||i>=image.length || j>=image[0].length || image[i][j]!=src_color){
9            return;
10        }
11        image[i][j]=color;
12        dfs(image,i,j+1,src_color,color);
13        dfs(image,i,j-1,src_color,color);
14        dfs(image,i+1,j,src_color,color);
15        dfs(image,i-1,j,src_color,color);
16        
17
18
19    }
20}