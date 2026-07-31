// Last updated: 8/1/2026, 12:01:26 AM

class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int[] q= nums.clone();

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int sum = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;

            if (isValid(nums, sorted, k)) {
                sum += k;
            }
        }

        return sum;
    }

    private boolean isValid(int[] nums, int[] sorted, int k) {
        int n = nums.length;

        for (int i = 0; i < n; i += k) {
            if (!checkBlock(nums, sorted, i, k)) {
                return false;
            }
        }

        return true;
    }

    private boolean checkBlock(int[] nums, int[] sorted, int start, int k) {

        int breaks = 0;

        for (int j = 0; j < k; j++) {
            int curr = nums[start + j];
            int next = nums[start + (j + 1) % k];

            if (curr > next) breaks++;
            if (breaks > 1) return false;
        }
        int[] a = Arrays.copyOfRange(nums, start, start + k);
        int[] b = Arrays.copyOfRange(sorted, start, start + k);

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}