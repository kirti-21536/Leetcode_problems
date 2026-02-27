// Last updated: 2/28/2026, 1:07:31 AM
1class Solution {
2    public int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
3        int n = boxes.length;
4
5        int[] dp = new int[n + 1];
6        int[] change = new int[n + 1];
7        long[] weight = new long[n + 1];
8
9        for (int i = 1; i <= n; i++) {
10            weight[i] = weight[i - 1] + boxes[i - 1][1];
11            if (i > 1 && boxes[i - 1][0] != boxes[i - 2][0]) {
12                change[i] = change[i - 1] + 1;
13            } else {
14                change[i] = change[i - 1];
15            }
16        }
17
18        Deque<Integer> dq = new ArrayDeque<>();
19        dq.offer(0);
20
21        int left = 0;
22
23        for (int i = 1; i <= n; i++) {
24            while (i - left > maxBoxes || weight[i] - weight[left] > maxWeight) {
25                if (dq.peekFirst() == left) dq.pollFirst();
26                left++;
27            }
28
29            dp[i] = dp[dq.peekFirst()] + change[i] - change[dq.peekFirst() + 1] + 2;
30
31            if (i < n) {
32                int val = dp[i] - change[i + 1];
33                while (!dq.isEmpty()) {
34                    int j = dq.peekLast();
35                    if (dp[j] - change[j + 1] >= val) dq.pollLast();
36                    else break;
37                }
38                dq.offer(i);
39            }
40        }
41        return dp[n];
42    }
43}