// Last updated: 12/20/2025, 11:55:56 PM
class Solution {
    public int countOdds(int low, int high) {
        if(low%2==0 && high%2==0){
        return (high - low) /2;
       }
        return (high - low)/2+1;
    //   return (high + 1) / 2 - low / 2;
       
    }
}