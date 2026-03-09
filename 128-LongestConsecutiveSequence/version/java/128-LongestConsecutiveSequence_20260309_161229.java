// Last updated: 3/9/2026, 4:12:29 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit=0;
4        for(int i=1;i<prices.length;i++){
5            if(prices[i]>prices[i-1]){
6                profit+=prices[i]-prices[i-1];
7            }
8        }
9        return profit;
10        
11    }
12}