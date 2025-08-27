// Last updated: 8/28/2025, 12:51:12 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        
        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        
        return maxCount;
        
    }
}