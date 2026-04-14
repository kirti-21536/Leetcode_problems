// Last updated: 4/14/2026, 3:42:15 PM
1class Solution {
2    public int maxProfit(int k, int[] prices) {
3        int n = prices.length;
4        if (n == 0) return 0;
5
6        if (k >= n / 2) {
7            int profit = 0;
8            for (int i = 1; i < n; i++) {
9                if (prices[i] > prices[i - 1]) {
10                    profit += prices[i] - prices[i - 1];
11                }
12            }
13            return profit;
14        }
15
16        int[] buy = new int[k + 1];
17        int[] sell = new int[k + 1];
18
19        for (int i = 0; i <= k; i++) {
20            buy[i] = Integer.MIN_VALUE;
21        }
22
23        for (int price : prices) {
24            for (int i = 1; i <= k; i++) {
25                buy[i] = Math.max(buy[i], sell[i - 1] - price);
26                sell[i] = Math.max(sell[i], buy[i] + price);
27            }
28        }
29
30        return sell[k];
31    }
32}