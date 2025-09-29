// Last updated: 9/29/2025, 2:56:48 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }    
        }
        //set row zero
        for(int i:row){
            set_row_zero(matrix,i);
        }
        //set col zero
        for(int i:col){
            set_col_zero(matrix,i);
        }

        
    }
    private void set_row_zero(int matrix[][],int row){
        for(int i=0;i<matrix[0].length;i++){
            matrix[row][i]=0;
        }
    }
    private void set_col_zero(int matrix[][],int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col]=0;
        }
    }
}