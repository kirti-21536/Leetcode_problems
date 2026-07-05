// Last updated: 7/5/2026, 3:46:09 PM
1class Solution {
2    public int[] pathsWithMaxScore(List<String> board) {
3        int n = board.size();
4        int MOD = 1_000_000_007;
5
6        int[][] score = new int[n][n];
7        int[][] ways = new int[n][n];
8
9        for (int[] row : score)
10            Arrays.fill(row, -1);
11
12        score[n - 1][n - 1] = 0;
13        ways[n - 1][n - 1] = 1;
14
15        for (int i = n - 1; i >= 0; i--) {
16            for (int j = n - 1; j >= 0; j--) {
17
18                char c = board.get(i).charAt(j);
19
20                if (c == 'X' || (i == n - 1 && j == n - 1))
21                    continue;
22
23                int best = -1;
24                long cnt = 0;
25
26                int[][] dirs = {{1, 0}, {0, 1}, {1, 1}};
27
28                for (int[] d : dirs) {
29                    int ni = i + d[0];
30                    int nj = j + d[1];
31
32                    if (ni >= n || nj >= n)
33                        continue;
34
35                    if (score[ni][nj] == -1)
36                        continue;
37
38                    if (score[ni][nj] > best) {
39                        best = score[ni][nj];
40                        cnt = ways[ni][nj];
41                    } else if (score[ni][nj] == best) {
42                        cnt = (cnt + ways[ni][nj]) % MOD;
43                    }
44                }
45
46                if (best == -1)
47                    continue;
48
49                score[i][j] = best;
50                ways[i][j] = (int) (cnt % MOD);
51
52                if (c != 'E') {
53                    score[i][j] += c - '0';
54                }
55            }
56        }
57
58        if (ways[0][0] == 0)
59            return new int[]{0, 0};
60
61        return new int[]{score[0][0], ways[0][0]};
62    }
63}