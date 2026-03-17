// Last updated: 3/17/2026, 12:51:24 PM
1class Solution {
2    public int shortestPath(int[][] grid, int k) {
3
4        int n = grid.length;
5        int m = grid[0].length;
6
7        int[][] dist = new int[n][m];
8        for(int[] row : dist)
9            Arrays.fill(row, -1);
10
11        Queue<int[]> q = new LinkedList<>();
12        q.add(new int[]{0,0,k});
13        dist[0][0] = k;
14
15        int steps = 0;
16        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
17
18        while(!q.isEmpty()){
19            int size = q.size();
20            for(int s=0;s<size;s++){
21                int[] cur = q.poll();
22                int r = cur[0];
23                int c = cur[1];
24                int rem = cur[2];
25
26                if(r == n-1 && c == m-1)
27                    return steps;
28
29                for(int[] d : dir){
30
31                    int nr = r + d[0];
32                    int nc = c + d[1];
33
34                    if(nr>=0 && nc>=0 && nr<n && nc<m){
35
36                        int newRem = rem - grid[nr][nc];
37
38                        if(newRem >= 0 && dist[nr][nc] < newRem){
39                            dist[nr][nc] = newRem;
40                            q.add(new int[]{nr,nc,newRem});
41                        }
42                    }
43                }
44            }
45
46            steps++;
47        }
48        return -1;
49    }
50}