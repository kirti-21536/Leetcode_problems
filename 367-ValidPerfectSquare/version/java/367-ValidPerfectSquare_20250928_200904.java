// Last updated: 9/28/2025, 8:09:04 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true; 

        long lo = 1, hi = num / 2; 
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long square = mid * mid;

            if (square == num) return true;
            if (square < num) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
        
    }
}