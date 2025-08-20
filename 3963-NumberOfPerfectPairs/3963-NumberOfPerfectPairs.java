// Last updated: 8/20/2025, 11:50:13 PM
class Solution {
    public long perfectPairs(int[] nums) {
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