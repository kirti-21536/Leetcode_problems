// Last updated: 12/4/2025, 1:00:35 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        for(int i=0;i< matrix.length;i++){
4            for(int j=0;j< matrix[0].length;j++){
5                if(matrix[i][j]==target){
6                    return true;
7                }
8
9            }
10        }
11        return false;
12        
13    }
14}