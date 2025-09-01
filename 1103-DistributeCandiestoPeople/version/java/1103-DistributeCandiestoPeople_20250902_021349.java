// Last updated: 9/2/2025, 2:13:49 AM
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[]=new int[num_people];
        int give = 1;  
        int i = 0;     
        while (candies > 0) {
            arr[i] += Math.min(give, candies); 
            candies -= give;
            give++;
            i = (i + 1) % num_people; 
        }
        
        return arr;

        
    }
}