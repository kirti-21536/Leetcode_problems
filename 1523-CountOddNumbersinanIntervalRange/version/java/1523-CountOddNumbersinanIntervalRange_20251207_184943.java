// Last updated: 12/7/2025, 6:49:43 PM
class Solution {
    public int countOdds(int low, int high) {
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        }
        System.gc();
        return (high - low) / 2 + 1;
    }
}