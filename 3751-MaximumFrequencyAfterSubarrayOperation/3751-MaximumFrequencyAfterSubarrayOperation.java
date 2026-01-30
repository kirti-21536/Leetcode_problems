// Last updated: 1/30/2026, 12:25:42 PM
class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        int n = nums.length;
        int base = 0;
        for (int num : nums) {
            if (num == k) base++;
        }

        int ans = base;
        for (int v = 1; v <= 50; v++) {
            if (v == k) continue;

            int cur = 0;
            int best = 0;

            for (int num : nums) {
                if (num == v) cur += 1;
                else if (num == k) cur -= 1;

                cur = Math.max(cur, 0);
                best = Math.max(best, cur);
            }

            ans = Math.max(ans, base + best);
        }

        return ans;
    }
}
