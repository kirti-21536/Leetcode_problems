// Last updated: 11/7/2026, 9:48:43 PM
1class Solution {
2    public int[] assignTasks(int[] servers, int[] tasks) {
3        PriorityQueue<int[]> available = new PriorityQueue<>(
4            (a, b) -> a[0] != b[0]
5                ? a[0] - b[0]
6                : a[1] - b[1]
7        );
8
9        PriorityQueue<int[]> busy = new PriorityQueue<>(
10            (a, b) -> a[0] != b[0]
11                ? a[0] - b[0]
12                : (a[1] != b[1] ? a[1] - b[1] : a[2] - b[2])
13        );
14
15        for (int i = 0; i < servers.length; i++) {
16            available.offer(new int[]{servers[i], i});
17        }
18
19        int[] ans = new int[tasks.length];
20        long time = 0;
21        for (int i = 0; i < tasks.length; i++) {
22            time = Math.max(time, i);
23            while (!busy.isEmpty() && busy.peek()[0] <= time) {
24                int[] server = busy.poll();
25                available.offer(new int[]{server[1], server[2]});
26            }
27            if (available.isEmpty()) {
28                time = busy.peek()[0];
29
30                while (!busy.isEmpty() && busy.peek()[0] <= time) {
31                    int[] server = busy.poll();
32                    available.offer(new int[]{server[1], server[2]});
33                }
34            }
35
36            int[] server = available.poll();
37            ans[i] = server[1];
38            busy.offer(new int[]{
39                (int)(time + tasks[i]),
40                server[0],
41                server[1]
42            });
43        }
44
45        return ans;
46    }
47}