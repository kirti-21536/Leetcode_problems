// Last updated: 5/6/2026, 4:53:39 PM
1class Solution {
2    public char[][] rotateTheBox(char[][] box) {
3        int m = box.length;
4        int n = box[0].length;
5        for (int i = 0; i < m; i++) {
6            int empty = n - 1;
7
8            for (int j = n - 1; j >= 0; j--) {
9                if (box[i][j] == '*') {
10                    empty = j - 1;
11                } 
12                else if (box[i][j] == '#') {
13                    box[i][j] = '.';
14                    box[i][empty] = '#';
15                    empty--;
16                }
17            }
18        }
19
20        char[][] ans = new char[n][m];
21
22        for (int i = 0; i < m; i++) {
23            for (int j = 0; j < n; j++) {
24                ans[j][m - 1 - i] = box[i][j];
25            }
26        }
27
28        return ans;
29    }
30}