// Last updated: 10/10/2025, 2:59:34 PM
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0,left=0;
        for (int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];
            if (map.containsKey(fruit)) {
                map.put(fruit, map.get(fruit) + 1);
            } else {
                map.put(fruit, 1);
            }
            while (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
        

    }
}