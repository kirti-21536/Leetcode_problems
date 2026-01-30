// Last updated: 1/30/2026, 12:25:58 PM
class Solution {
    public int maximizeWin(int[] prizePositions, int k) {
        int n = prizePositions.length;
        int[] count = new int[n];
        int[] best = new int[n];

        int left = 0;

        // Sliding window
        for (int right = 0; right < n; right++) {
            while (prizePositions[right] - prizePositions[left] > k) {
                left++;
            }
            count[right] = right - left + 1;
        }
        // Prefix maximum
        best[0] = count[0];
        for (int i = 1; i < n; i++) {
            best[i] = Math.max(best[i - 1], count[i]);
        }
        // Combine two segments
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int prevIndex = i - count[i];
            int prevBest = prevIndex >= 0 ? best[prevIndex] : 0;
            ans = Math.max(ans, count[i] + prevBest);
        }

        return ans;
    }
}
