// Last updated: 10/13/2025, 4:43:52 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyPrev = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyNext = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (emptyPrev && emptyNext) {
                    flowerbed[i] = 1;  // Plant the flower
                    count++;
                    if (count >= n) return true; // Enough flowers planted
                }
            }
        }

        return count >= n;
        
    }
}