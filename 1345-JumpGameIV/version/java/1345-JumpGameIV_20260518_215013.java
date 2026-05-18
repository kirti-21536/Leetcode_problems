// Last updated: 5/18/2026, 9:50:13 PM
1class Solution {
2    public int minJumps(int[] arr) {
3
4        int n = arr.length;
5
6        if (n == 1) return 0;
7        Map<Integer, List<Integer>> map = new HashMap<>();
8
9        for (int i = 0; i < n; i++) {
10            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
11        }
12
13        Queue<Integer> q = new LinkedList<>();
14        boolean[] vis = new boolean[n];
15
16        q.offer(0);
17        vis[0] = true;
18
19        int steps = 0;
20
21        while (!q.isEmpty()) {
22
23            int size = q.size();
24
25            while (size-- > 0) {
26
27                int idx = q.poll();
28
29                // reached end
30                if (idx == n - 1) return steps;
31                List<Integer> next = map.get(arr[idx]);
32                if (next != null) {
33                    for (int nei : next) {
34                        if (!vis[nei]) {
35                            vis[nei] = true;
36                            q.offer(nei);
37                        }
38                    }
39                    map.remove(arr[idx]);
40                }
41                if (idx - 1 >= 0 && !vis[idx - 1]) {
42                    vis[idx - 1] = true;
43                    q.offer(idx - 1);
44                }
45                if (idx + 1 < n && !vis[idx + 1]) {
46                    vis[idx + 1] = true;
47                    q.offer(idx + 1);
48                }
49            }
50
51            steps++;
52        }
53
54        return -1;
55    }
56}