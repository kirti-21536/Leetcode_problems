// Last updated: 10/8/2025, 11:34:35 AM
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum=prices[0]+prices[1];
        if(sum<=money){
            return money-sum;
        }
        return money;
        
    }
}