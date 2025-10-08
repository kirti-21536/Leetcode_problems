// Last updated: 10/8/2025, 11:34:43 AM
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