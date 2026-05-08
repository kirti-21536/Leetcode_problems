// Last updated: 5/9/2026, 12:42:11 AM
1class Solution {
2
3    public int minJumps(int[] nums) {
4
5        int n = nums.length;
6
7        Map<Integer, List<Integer>> map = new HashMap<>();
8
9        for (int i = 0; i < n; i++) {
10            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
11        }
12
13        int max = 0;
14
15        for (int x : nums) {
16            max = Math.max(max, x);
17        }
18
19        Queue<Integer> q = new LinkedList<>();
20        boolean[] vis = new boolean[n];
21
22        Set<Integer> usedPrime = new HashSet<>();
23
24        q.offer(0);
25        vis[0] = true;
26
27        int jumps = 0;
28
29        while (!q.isEmpty()) {
30
31            int size = q.size();
32
33            while (size-- > 0) {
34
35                int i = q.poll();
36
37                if (i == n - 1) {
38                    return jumps;
39                }
40
41                // left
42                if (i - 1 >= 0 && !vis[i - 1]) {
43                    vis[i - 1] = true;
44                    q.offer(i - 1);
45                }
46
47                // right
48                if (i + 1 < n && !vis[i + 1]) {
49                    vis[i + 1] = true;
50                    q.offer(i + 1);
51                }
52
53                int val = nums[i];
54
55                // teleport
56                if (isPrime(val) && !usedPrime.contains(val)) {
57
58                    usedPrime.add(val);
59
60                    for (int mul = val; mul <= max; mul += val) {
61
62                        if (map.containsKey(mul)) {
63
64                            for (int idx : map.get(mul)) {
65
66                                if (!vis[idx]) {
67                                    vis[idx] = true;
68                                    q.offer(idx);
69                                }
70                            }
71                        }
72                    }
73                }
74            }
75
76            jumps++;
77        }
78
79        return -1;
80    }
81
82    boolean isPrime(int x) {
83
84        if (x < 2) {
85            return false;
86        }
87
88        for (int i = 2; i * i <= x; i++) {
89
90            if (x % i == 0) {
91                return false;
92            }
93        }
94
95        return true;
96    }
97}