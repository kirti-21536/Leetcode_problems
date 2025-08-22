// Last updated: 8/23/2025, 12:58:17 AM
class Solution {
    public int minimumArea(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int minR = rows, maxR = -1;
        int minC = cols, maxC = -1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    minR = Math.min(minR, i);
                    maxR = Math.max(maxR, i);
                    minC = Math.min(minC, j);
                    maxC = Math.max(maxC, j);
                }
            }
        }

        int h = maxR - minR + 1;
        int w = maxC - minC + 1;

        return h * w;
    }
}