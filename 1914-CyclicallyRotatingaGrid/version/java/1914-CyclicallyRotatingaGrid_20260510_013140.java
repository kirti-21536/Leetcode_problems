// Last updated: 5/10/2026, 1:31:40 AM
1class Solution {
2    public int[][] rotateGrid(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int layers = Math.min(m, n) / 2;
7
8        for (int layer = 0; layer < layers; layer++) {
9
10            ArrayList<Integer> list = new ArrayList<>();
11
12            int top = layer;
13            int left = layer;
14            int bottom = m - layer - 1;
15            int right = n - layer - 1;
16
17            // top row
18            for (int j = left; j <= right; j++) {
19                list.add(grid[top][j]);
20            }
21
22            // right column
23            for (int i = top + 1; i <= bottom - 1; i++) {
24                list.add(grid[i][right]);
25            }
26
27            // bottom row
28            for (int j = right; j >= left; j--) {
29                list.add(grid[bottom][j]);
30            }
31
32            // left column
33            for (int i = bottom - 1; i >= top + 1; i--) {
34                list.add(grid[i][left]);
35            }
36
37            int size = list.size();
38            int rot = k % size;
39
40            // rotate left by rot
41            ArrayList<Integer> rotated = new ArrayList<>();
42
43            for (int i = 0; i < size; i++) {
44                rotated.add(list.get((i + rot) % size));
45            }
46
47            int idx = 0;
48
49            // put back top row
50            for (int j = left; j <= right; j++) {
51                grid[top][j] = rotated.get(idx++);
52            }
53
54            // put back right column
55            for (int i = top + 1; i <= bottom - 1; i++) {
56                grid[i][right] = rotated.get(idx++);
57            }
58
59            // put back bottom row
60            for (int j = right; j >= left; j--) {
61                grid[bottom][j] = rotated.get(idx++);
62            }
63
64            // put back left column
65            for (int i = bottom - 1; i >= top + 1; i--) {
66                grid[i][left] = rotated.get(idx++);
67            }
68        }
69
70        return grid;
71    }
72}