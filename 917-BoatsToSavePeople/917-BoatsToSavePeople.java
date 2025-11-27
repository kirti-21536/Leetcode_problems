// Last updated: 11/27/2025, 11:46:32 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats=0;
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        while(i<=j){
            int sum=people[i]+people[j];
            if(sum<=limit){
                boats++;
                i++;
                j--;
            }
            else{
                boats++;
                j--;
            }
        }
        
    return boats;
    }
}