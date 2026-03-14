// Last updated: 3/14/2026, 12:10:13 PM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5
6        Queue<int[]> q = new LinkedList<>();
7        int fresh = 0;
8
9        for(int i = 0; i < n; i++){
10            for(int j = 0; j < m; j++){
11                if(grid[i][j] == 2){
12                    q.add(new int[]{i,j});
13                }
14                if(grid[i][j] == 1){
15                    fresh++;
16                }
17            }
18        }
19
20        if(fresh == 0) return 0;
21
22        int minutes = 0;
23        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
24
25        while(!q.isEmpty()){
26            int size = q.size();
27            boolean spread = false;
28
29            for(int i = 0; i < size; i++){
30                int[] cur = q.poll();
31
32                for(int[] d : dir){
33                    int r = cur[0] + d[0];
34                    int c = cur[1] + d[1];
35
36                    if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==1){
37                        grid[r][c] = 2;
38                        fresh--;
39                        q.add(new int[]{r,c});
40                        spread = true;
41                    }
42                }
43            }
44
45            if(spread) minutes++;
46        }
47
48        return fresh == 0 ? minutes : -1;
49    }
50}