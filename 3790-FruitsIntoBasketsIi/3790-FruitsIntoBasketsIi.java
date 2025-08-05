// Last updated: 8/6/2025, 12:39:55 AM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        List<Integer> list = new ArrayList<>();
        for (int num : baskets) {
            list.add(num); 
}
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<list.size();j++){
                if(fruits[i]<=list.get(j)){
                    list.remove(j);
                    break;
                }

            }
        }
        return list.size();
        
    }
}