// Last updated: 1/13/2026, 11:12:51 AM
class Solution {
    public int minimumNumbers(int num, int k) {
         if (num == 0) return 0;

        for (int x = 1; x <= 10; x++) {
            if ((x * k) % 10 == num % 10 && x * k <= num) {
                return x;
            }
        }
        return -1;
        
    }
}