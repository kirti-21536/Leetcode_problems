// Last updated: 8/1/2025, 8:14:47 PM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int new_mat[][]=new int[r][c];
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c)return mat;
        if(r==m&&c==n)return mat;
        int n_index=0;
        int o_index=0;
        while(n_index<r*c && o_index<m*n){
            new_mat[n_index/c][n_index%c]=mat[o_index/n][o_index%n];
            n_index++;
            o_index++;
        }
        return new_mat;
        
    }
   
}