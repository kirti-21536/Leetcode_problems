// Last updated: 11/25/2025, 10:40:51 PM
class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        
        int r = 0;
        for (int l = 1; l <= k; l++) {
            r = (r * 10 + 1) % k;
            if (r == 0) return l;
        }
        
        return -1;
        
    }
}