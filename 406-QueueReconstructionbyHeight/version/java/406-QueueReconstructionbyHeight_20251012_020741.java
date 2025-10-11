// Last updated: 10/12/2025, 2:07:41 AM
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) 
                return a[1] - b[1]; // same height
            else 
                return b[0] - a[0]; // taller height
        });

        List<int[]> result = new ArrayList<>();
        for (int[] person : people) {
            result.add(person[1], person); 
        }

        return result.toArray(new int[people.length][]);
        
    }

}