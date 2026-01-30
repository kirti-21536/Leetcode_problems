// Last updated: 1/30/2026, 12:26:08 PM
class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int ans = 0;
        
        Stack<int[]> stack = new Stack<>(); //arr has value and steps to remove it

        for (int i = n - 1; i >= 0; i--) {
            int steps = 0;
            while (!stack.isEmpty() && nums[i] > stack.peek()[0]) {
                steps = Math.max(steps + 1, stack.peek()[1]);
                stack.pop();
            }
            ans = Math.max(ans, steps);
            stack.push(new int[]{nums[i], steps});
        }
        return ans;
    }
}
