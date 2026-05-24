// Last updated: 5/25/2026, 12:55:07 AM
1class Solution {
2    int[] dp;
3    int[] arr;
4    int d;
5
6    public int maxJumps(int[] arr, int d) {
7        int n = arr.length;
8        this.arr = arr;
9        this.d = d;
10        dp = new int[n];
11        int ans = 1;
12        for (int i = 0; i < n; i++) {
13            ans = Math.max(ans, dfs(i));
14        }
15        return ans;
16    }
17
18    public int dfs(int i) {
19        if (dp[i] != 0) {
20            return dp[i];
21        }
22        int best = 1;
23        // left
24        for (int j = i - 1; j >= Math.max(0, i - d); j--) {
25            if (arr[j] >= arr[i]) {
26                break;
27            }
28            best = Math.max(best, 1 + dfs(j));
29        }
30        // right
31        for (int j = i + 1; j <= Math.min(arr.length - 1, i + d); j++) {
32            if (arr[j] >= arr[i]) {
33                break;
34            }
35            best = Math.max(best, 1 + dfs(j));
36        }
37        return dp[i] = best;
38    }
39}