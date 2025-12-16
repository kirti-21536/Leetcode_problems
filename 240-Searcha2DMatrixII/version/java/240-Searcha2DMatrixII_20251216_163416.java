// Last updated: 12/16/2025, 4:34:16 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3      int r=0;
4      int c=matrix[0].length-1;
5    while(r<matrix.length && c>=0){
6        if(matrix[r][c]== target){
7            return true;
8        }
9        else if(matrix[r][c]>target){
10            c--;
11        }
12        else{
13            r++;
14        }
15    }
16    return false;
17    
18    
19        
20    }
21}