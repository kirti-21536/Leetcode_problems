// Last updated: 8/1/2026, 12:02:02 AM
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
         int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int countTarget = 0;

            for (int j = i; j < n; j++) {
                if (nums[j] == target) {
                    countTarget++;
                }

                int len = j - i + 1;

                if (2 * countTarget > len) {
                    ans++;
                }
            }
        }

        return ans;
        
    }
}