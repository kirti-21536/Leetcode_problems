// Last updated: 4/14/2026, 12:29:00 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3         int[][] dp = new int[prices.length][2];
4         for(int[] i: dp){
5            Arrays.fill(i,-1);
6        }
7     return func(prices,0,1,dp);
8    }
9        public int func(int[] prices, int idx, int buy, int[][] dp){
10        if(idx==prices.length){
11            return 0;
12        }
13
14        if(dp[idx][buy]!=-1){
15            return dp[idx][buy];
16        }
17        int profit = 0;
18        if(buy==1){
19            profit = Math.max(-prices[idx]+func(prices,idx+1,0,dp), func(prices,idx+1,1,dp));
20        }
21        else{
22            profit = Math.max(prices[idx]+func(prices,idx+1,1,dp),func(prices,idx+1,0,dp));
23        }
24        return dp[idx][buy] = profit;
25    }
26}