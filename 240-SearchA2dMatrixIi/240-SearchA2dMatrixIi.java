// Last updated: 8/1/2025, 8:15:16 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int r=0;
      int c=matrix[0].length-1;
    while(r<matrix.length && c>=0){
        if(matrix[r][c]== target){
            return true;
        }
        else if(matrix[r][c]>target){
            c--;
        }
        else{
            r++;
        }
    }
    return false;
    
    
        
    }
}