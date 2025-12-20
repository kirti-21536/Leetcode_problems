// Last updated: 12/20/2025, 11:56:18 PM
class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        n = n % 14;
        if (n == 0) n = 14;
        for (int day = 0; day < n; day++) {
            int[] next = new int[8];
            for (int i = 1; i < 7; i++) {
                if (cells[i - 1] == cells[i + 1])
                    next[i] = 1;
                else
                    next[i] = 0;
            }
            cells = next;
        }

        return cells;
    }
}