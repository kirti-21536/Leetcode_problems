// Last updated: 3/17/2026, 10:51:32 AM
1class Solution {
2    public int minimumEffortPath(int[][] heights) {
3        int n = heights.length;
4        int m = heights[0].length;
5
6        int[][] dist = new int[n][m];
7        for(int[] row : dist)
8            Arrays.fill(row, Integer.MAX_VALUE);
9
10        PriorityQueue<int[]> pq =
11            new PriorityQueue<>((a,b)->a[0]-b[0]);
12
13        pq.add(new int[]{0,0,0});
14        dist[0][0] = 0;
15
16        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
17
18        while(!pq.isEmpty()){
19            int[] cur = pq.poll();
20            int effort = cur[0];
21            int r = cur[1];
22            int c = cur[2];
23
24            if(r == n-1 && c == m-1)
25                return effort;
26
27            for(int[] d : dir){
28                int nr = r + d[0];
29                int nc = c + d[1];
30
31                if(nr>=0 && nc>=0 && nr<n && nc<m){
32                    int diff = Math.abs(
33                        heights[r][c] - heights[nr][nc]);
34
35                    int newEffort = Math.max(effort, diff);
36
37                    if(newEffort < dist[nr][nc]){
38                        dist[nr][nc] = newEffort;
39                        pq.add(new int[]{newEffort,nr,nc});
40                    }
41                }
42            }
43        }
44
45        return 0;
46    }
47}