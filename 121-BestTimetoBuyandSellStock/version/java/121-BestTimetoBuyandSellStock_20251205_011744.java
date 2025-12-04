// Last updated: 12/5/2025, 1:17:44 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int maxprofit=0;
4        int minsofar=prices[0];
5        for(int i=0;i<prices.length;i++){
6            minsofar=Math.min(minsofar,prices[i]);
7            int Profit=prices[i]-minsofar;
8            maxprofit=Math.max(maxprofit,Profit);
9        }
10        return maxprofit;
11        
12    }
13}