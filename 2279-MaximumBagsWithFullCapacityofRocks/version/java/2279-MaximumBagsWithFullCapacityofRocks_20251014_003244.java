// Last updated: 10/14/2025, 12:32:44 AM
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=rocks.length;
        int need[]=new int[n];

        //need calculation
        for(int i=0;i<n;i++){
            need[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(need);
        int fullbags=0;
        for(int i=0;i<n;i++){
            if(need[i]==0){
                fullbags++;
            }
            else if(additionalRocks>=need[i]){
                additionalRocks-=need[i];
                fullbags++;
            }
            else{
                break;
            }
        }
        return fullbags;
    }
}