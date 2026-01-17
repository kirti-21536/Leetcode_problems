// Last updated: 1/18/2026, 2:26:58 AM
class Solution {
    public long maximumScore(int[] nums, String s) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        boolean[] used = new boolean[nums.length];
        long ans = 0;
        int ptr = 0;
        for (int i = 0; i < s.length(); i++) {
            while (ptr <= i) {
                pq.offer(nums[ptr]);
                ptr++;
            }

            if (s.charAt(i) == '1') {
                ans += pq.poll(); // best available
            }
        }
        return ans;
    }
}