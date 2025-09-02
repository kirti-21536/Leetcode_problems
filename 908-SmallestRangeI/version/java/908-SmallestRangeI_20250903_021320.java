// Last updated: 9/3/2025, 2:13:20 AM
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int n: nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        
        int diff = max - min;
        return Math.max(0, diff - 2 * k);
        
    }
}