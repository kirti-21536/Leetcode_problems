// Last updated: 1/30/2026, 12:26:15 PM
class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long res = 0;
        long cur = 1;

        for (int x : nums) {
            if (x < cur) continue;

            if (x > cur) {
                long count = Math.min(k, x - cur);
                long last = cur + count - 1;

                res += (cur + last) * count / 2;
                k -= count;

                if (k == 0) return res;
            }
            cur = x + 1;
        }

        // If still need numbers
        if (k > 0) {
            long last = cur + k - 1;
            res += (cur + last) * k / 2;
        }

        return res;
    }
}
