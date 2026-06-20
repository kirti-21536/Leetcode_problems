// Last updated: 6/20/2026, 11:34:52 PM
1class Solution {
2    public int maxBuilding(int n, int[][] restrictions) {
3        List<int[]> list = new ArrayList<>();
4        // Building 1 always has height 0
5        list.add(new int[]{1, 0});
6
7        for (int[] r : restrictions) {
8            list.add(new int[]{r[0], r[1]});
9        }
10        // Add building n if not present
11        boolean hasN = false;
12        for (int[] r : list) {
13            if (r[0] == n) {
14                hasN = true;
15                break;
16            }
17        }
18
19        if (!hasN) {
20            list.add(new int[]{n, n - 1});
21        }
22        // Sort by building id
23        list.sort((a, b) -> a[0] - b[0]);
24        int m = list.size();
25        // Left -> Right
26        for (int i = 1; i < m; i++) {
27            int dist = list.get(i)[0] - list.get(i - 1)[0];
28            list.get(i)[1] = Math.min(list.get(i)[1], list.get(i - 1)[1] + dist);
29        }
30        // Right -> Left
31        for (int i = m - 2; i >= 0; i--) {
32            int dist = list.get(i + 1)[0] - list.get(i)[0];
33            list.get(i)[1] = Math.min(list.get(i)[1], list.get(i + 1)[1] + dist);
34        }
35
36        int ans = 0;
37        // Find maximum possible height
38        for (int i = 1; i < m; i++) {
39            int id1 = list.get(i - 1)[0];
40            int h1 = list.get(i - 1)[1];
41            int id2 = list.get(i)[0];
42            int h2 = list.get(i)[1];
43
44            int dist = id2 - id1;
45            int peak = (h1 + h2 + dist) / 2;
46            ans = Math.max(ans, peak);
47        }
48        return ans;
49    }
50}