// Last updated: 9/6/2025, 11:05:56 AM
class Solution {
    public long minOperations(int[][] queries) {
        long ans = 0;
        
        for (int[] q : queries) {
            long l = q[0], r = q[1];
            long total = 0;
            int k = 1;
            long powPrev = 1;

            while (powPrev <= r) {
                long powCurr = powPrev * 4;
                long left = Math.max(l, powPrev);
                long right = Math.min(r, powCurr - 1);

                if (left <= right) {
                    long count = right - left + 1;
                    total += count * k;
                }

                k++;
                powPrev = powCurr;
            }

            ans += (total + 1) / 2; // ceil division
        }
        
        return ans;
    

        
    }
}