// Last updated: 8/20/2025, 11:48:21 PM
class Solution {
    public long perfectPairs(int[] nums) {
        // int n = nums.length;
        // int count = 0;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         int a = nums[i];
        //         int b = nums[j];

        //         int minVal = Math.min(Math.abs(a - b), Math.abs(a + b));
        //         int minAbs = Math.min(Math.abs(a), Math.abs(b));

        //         int maxVal = Math.max(Math.abs(a - b), Math.abs(a + b));
        //         int maxAbs = Math.max(Math.abs(a), Math.abs(b));

        //         if (minVal <= minAbs && maxVal >= maxAbs) {
        //             count++;
        //         }
        //     }
        // }
        int n = nums.length;
        // Take absolute values
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        
        Arrays.sort(nums);
        
        long count = 0;
        int j = 0;
        
        for (int i = 0; i < n; i++) {
            while (j < n && nums[j] <= 2 * nums[i]) {
                j++;
            }
            // valid pairs = (i+1 ... j-1)
            count += (j - i - 1);
        }

        return count;
}
}