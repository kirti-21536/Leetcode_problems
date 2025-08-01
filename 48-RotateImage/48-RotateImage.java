// Last updated: 8/1/2025, 8:16:19 PM
class Solution {
    public void rotate(int[][] matrix) {
        int m =matrix.length;
        int n = matrix[0].length;
        //transpose of the matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        //reverse of matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<m/2;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-1-j];
                matrix[i][m-1-j]=temp;
            }
        }
        

        
    }
}