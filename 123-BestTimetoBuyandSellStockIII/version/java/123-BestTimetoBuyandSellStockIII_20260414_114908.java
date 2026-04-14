// Last updated: 4/14/2026, 11:49:08 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy1 = Integer.MAX_VALUE;
4        int buy2 = Integer.MAX_VALUE;
5        int profit1 = 0;
6        int profit2 = 0;
7
8        for (int price : prices) {
9            buy1 = Math.min(buy1, price);
10            profit1 = Math.max(profit1, price - buy1);
11
12            buy2 = Math.min(buy2, price - profit1);
13            profit2 = Math.max(profit2, price - buy2);
14        }
15
16        return profit2;
17    }
18}