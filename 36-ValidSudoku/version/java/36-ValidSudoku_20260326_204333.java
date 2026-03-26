// Last updated: 3/26/2026, 8:43:33 PM
1import java.util.*;
2
3class Solution {
4    public boolean isValidSudoku(char[][] board) {
5        HashSet<String> set = new HashSet<>();
6
7        for (int i = 0; i < 9; i++) {
8            for (int j = 0; j < 9; j++) {
9
10                char num = board[i][j];
11
12                if (num == '.') continue;
13
14                // row check
15                if (!set.add(num + " in row " + i)) return false;
16
17                // column check
18                if (!set.add(num + " in col " + j)) return false;
19
20                // box check
21                int boxRow = i / 3;
22                int boxCol = j / 3;
23                if (!set.add(num + " in box " + boxRow + "-" + boxCol)) return false;
24            }
25        }
26
27        return true;
28    }
29}