// Last updated: 8/1/2025, 8:15:05 PM
class Solution {
    public boolean increasingTriplet(int[] nums) {
          int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;

    for (int num : nums) {
        if (num <= first) {
            first = num;
        } else if (num <= second) {
            second = num;
        } else {
            // Found a number greater than both first and second
            return true;
        }
    }
    return false;
}
}