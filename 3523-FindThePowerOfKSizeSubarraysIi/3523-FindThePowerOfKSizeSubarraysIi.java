// Last updated: 1/13/2026, 11:10:55 AM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        if(k==1)return nums; 
        int[] ans = new int[n - k + 1];
        int len = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) len++;
            else len = 1;

            if (i >= k - 1) {
                ans[i - k + 1] = len >= k ? nums[i] : -1;
            }
        }
        return ans;
        
    }
}