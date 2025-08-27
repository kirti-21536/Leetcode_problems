// Last updated: 8/28/2025, 1:24:26 AM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum=0,evensum=0;
        int odd=1,even=2;
        for(int i=0;i<n;i++){
            oddsum+=odd;
            evensum+=even;
            odd+=2;
            even+=2;
        }
        while(oddsum!=0){
            int temp=oddsum;
            oddsum=evensum%oddsum;
            evensum=temp;
        }
        return evensum;
    }
}