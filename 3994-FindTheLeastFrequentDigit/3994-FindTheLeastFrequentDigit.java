// Last updated: 9/2/2025, 1:19:51 AM
class Solution {
    public int getLeastFrequentDigit(int n) {
        int freq[]=new int[10];
        while(n>0){
            int r=n%10;
            freq[r]++;
            n/=10;
        }
        int ans=-1;
        int min=Integer.MAX_VALUE;
        for(int d=0;d<=9;d++){
            if(freq[d]>0){
                if(freq[d]<min){
                    min=freq[d];
                    ans=d;
                }
            }
        }
        return ans;
        
        
    }
}