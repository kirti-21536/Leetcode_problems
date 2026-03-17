// Last updated: 3/17/2026, 3:34:43 PM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3
4        List<Integer>[] graph = new ArrayList[numCourses];
5
6        for (int i = 0; i < numCourses; i++){
7            graph[i] = new ArrayList<>();
8        }
9        int[] indegree = new int[numCourses];
10        for (int[] p : prerequisites) {
11            graph[p[1]].add(p[0]); 
12            indegree[p[0]]++;
13        }
14        Queue<Integer> q = new LinkedList<>();
15        for (int i = 0; i < numCourses; i++) {
16            if (indegree[i] == 0)
17                q.add(i);
18        }
19
20        int count = 0;
21        while (!q.isEmpty()) {
22            int course = q.poll();
23            count++;
24            for (int next : graph[course]) {
25                indegree[next]--;
26                if (indegree[next] == 0)
27                    q.add(next);
28            }
29        }
30        return count == numCourses;
31    }
32}