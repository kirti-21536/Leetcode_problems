// Last updated: 3/4/2026, 11:38:00 PM
1class Solution {
2    public int numSpecial(int[][] mat) {
3        int count=0;
4        for(int i=0;i<mat.length;i++){
5            for(int j=0;j<mat[0].length;j++){
6                if(mat[i][j]==1){
7                    if(isspecial(mat,i,j)){
8                        count++;
9                    }
10                }
11            }
12        }
13        return count;
14    }
15    public boolean isspecial(int mat[][],int row,int col){
16        //check for row
17        for(int j=0;j<mat[0].length;j++){
18            if(col==j)continue;
19            if(mat[row][j]==1)return false;
20        }
21        //check for col
22        for(int i=0;i<mat.length;i++){
23            if(row==i)continue;
24            if(mat[i][col]==1)return false;
25        }
26        return true;
27
28    }
29}