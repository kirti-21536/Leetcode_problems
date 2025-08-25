// Last updated: 8/25/2025, 4:14:11 PM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
         if (mat == null || mat.length == 0) {
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int index = 0;
        boolean up = true;
        for (int d = 0; d < m + n - 1; d++) {
            int row, col;

            if (up) {
                if (d < m){
                    row = d;
                }
                else{
                    row = m - 1;
                }
                if (d < m){
                    col = 0;
                }
                else{
                    col = d - m + 1;
                }
                while (row >= 0 && col < n) {
                    result[index++] = mat[row][col];
                    row--;
                    col++;
                }
            }
            else {
                col = (d < n) ? d : n - 1;
                row = (d < n) ? 0 : d - n + 1;
                while (col >= 0 && row < m) {
                    result[index++] = mat[row][col];
                    row++;
                    col--;
                }
            }
            up = !up;
        }
        return result;
        
    }
}