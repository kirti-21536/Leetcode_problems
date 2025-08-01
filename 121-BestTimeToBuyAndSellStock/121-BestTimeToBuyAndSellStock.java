// Last updated: 8/1/2025, 8:15:53 PM
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minsofar=prices[0];
        for(int i=0;i<prices.length;i++){
            minsofar=Math.min(minsofar,prices[i]);
            int Profit=prices[i]-minsofar;
            maxprofit=Math.max(maxprofit,Profit);
        }
        return maxprofit;
        
    }
}