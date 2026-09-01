// Last updated: 9/1/2026, 11:52:11 PM
1
2class Solution {
3    public int minMoves(String[] classroom, int energy) {
4        int m = classroom.length;
5        int n = classroom[0].length();
6
7        int startR = 0, startC = 0;
8        int trashCount = 0;
9
10        // Give every trash cell a bit number
11        int[][] id = new int[m][n];
12        for (int[] row : id) Arrays.fill(row, -1);
13
14        for (int i = 0; i < m; i++) {
15            for (int j = 0; j < n; j++) {
16                char ch = classroom[i].charAt(j);
17
18                if (ch == 'S') {
19                    startR = i;
20                    startC = j;
21                } else if (ch == 'L') {
22                    id[i][j] = trashCount++;
23                }
24            }
25        }
26
27        int fullMask = (1 << trashCount) - 1;
28
29        // State = row, col, energy, cleaned-mask
30        Queue<int[]> q = new LinkedList<>();
31
32        // visited[r][c][energy][mask]
33        boolean[][][][] visited =
34            new boolean[m][n][energy + 1][1 << trashCount];
35
36        q.offer(new int[]{startR, startC, energy, 0});
37        visited[startR][startC][energy][0] = true;
38
39        int moves = 0;
40
41        int[] dr = {-1, 1, 0, 0};
42        int[] dc = {0, 0, -1, 1};
43
44        while (!q.isEmpty()) {
45            int size = q.size();
46
47            while (size-- > 0) {
48                int[] cur = q.poll();
49
50                int r = cur[0];
51                int c = cur[1];
52                int e = cur[2];
53                int mask = cur[3];
54
55                if (mask == fullMask) {
56                    return moves;
57                }
58
59                for (int d = 0; d < 4; d++) {
60                    int nr = r + dr[d];
61                    int nc = c + dc[d];
62
63                    if (nr < 0 || nr >= m || nc < 0 || nc >= n)
64                        continue;
65
66                    if (classroom[nr].charAt(nc) == 'X')
67                        continue;
68
69                    // Every move consumes 1 energy
70                    if (e == 0)
71                        continue;
72
73                    int ne = e - 1;
74
75                    char ch = classroom[nr].charAt(nc);
76
77                    // If this is trash, mark it cleaned
78                    int nmask = mask;
79
80                    if (ch == 'L') {
81                        int bit = id[nr][nc];
82                        nmask |= (1 << bit);
83                    }
84
85                    // Refill energy at charging station
86                    if (ch == 'R') {
87                        ne = energy;
88                    }
89
90                    if (!visited[nr][nc][ne][nmask]) {
91                        visited[nr][nc][ne][nmask] = true;
92                        q.offer(new int[]{nr, nc, ne, nmask});
93                    }
94                }
95            }
96
97            moves++;
98        }
99
100        return -1;
101    }
102}