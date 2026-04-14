// Last updated: 4/14/2026, 11:18:25 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int minsofar=Integer.MAX_VALUE;
4        int maxpro=0;
5        for(int i=0;i<prices.length;i++){
6            minsofar=Math.min(minsofar,prices[i]);
7            int profit=prices[i]-minsofar;
8            maxpro=Math.max(profit,maxpro);
9        }
10        return maxpro;
11        
12    }
13}