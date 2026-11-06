// Last updated: 11/6/2026, 8:52:17 PM
1class Solution {
2    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
3        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));
4        int m = queries.length;
5        int[][] q = new int[m][2];
6        for (int i = 0; i < m; i++) {
7            q[i][0] = queries[i];
8            q[i][1] = i;
9        }
10
11        Arrays.sort(q, (a, b) -> Integer.compare(a[0], b[0]));
12        int[] ans = new int[m];
13        int[] freq = new int[n + 1];
14
15        int left = 0, right = 0;
16        int active = 0;
17        for (int i = 0; i < m; i++) {
18            int time = q[i][0];
19            while (right < logs.length && logs[right][1] <= time) {
20                int server = logs[right][0];
21                if (freq[server] == 0)
22                    active++;
23
24                freq[server]++;
25                right++;
26            }
27            while (left < right && logs[left][1] < time - x) {
28                int server = logs[left][0];
29                freq[server]--;
30                if (freq[server] == 0)
31                    active--;
32
33                left++;
34            }
35
36            ans[q[i][1]] = n - active;
37        }
38
39        return ans;
40    }
41}
42