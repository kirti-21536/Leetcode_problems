// Last updated: 1/30/2026, 12:26:29 PM
class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int x : nums) sum += x;

        long diff = Math.abs((long) goal - sum);
        return (int) ((diff + limit - 1) / limit);
        
    }
}