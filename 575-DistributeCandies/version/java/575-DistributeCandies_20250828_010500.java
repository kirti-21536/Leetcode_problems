// Last updated: 8/28/2025, 1:05:00 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int candies=n/2;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(candyType[i]);
        }
        if(set.size()<=candies){
            return set.size();
        }
        
        return candies;
    }
}