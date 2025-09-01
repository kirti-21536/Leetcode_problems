// Last updated: 9/2/2025, 1:59:17 AM
class Solution {
    public boolean isUgly(int n) {
       if (n <= 0) return false;
        
        int[] factors = {2, 3, 5};
        for (int f : factors) {
            while (n % f == 0) {
                n /= f;
            }
        }
        
        return n == 1;
    }
}