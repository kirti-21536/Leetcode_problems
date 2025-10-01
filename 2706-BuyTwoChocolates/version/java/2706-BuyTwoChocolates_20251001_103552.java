// Last updated: 10/1/2025, 10:35:52 AM
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