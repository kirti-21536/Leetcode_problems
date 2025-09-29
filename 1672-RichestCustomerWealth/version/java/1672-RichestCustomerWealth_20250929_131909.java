// Last updated: 9/29/2025, 1:19:09 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxsum=0;
        for(int i=0;i<accounts.length;i++){
            int arr[]=accounts[i];
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j];
            }
            maxsum=Math.max(sum,maxsum);

        }
        return maxsum;
    }
}