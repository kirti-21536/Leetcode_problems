// Last updated: 11/4/2025, 10:52:19 PM
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        for (int i = 0; i <= n - k; i++) {
            int[] freq = new int[51];
            for (int j = i; j < i + k; j++) {
                freq[nums[j]]++;
            }
            List<Integer> top = new ArrayList<>();
            for (int c = k; c >= 1 && top.size() < x; c--) {
                for (int num = 50; num >= 1 && top.size() < x; num--) {
                    if (freq[num] == c) {
                        top.add(num);
                    }
                }
            }
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                if (top.contains(nums[j])) {
                    sum += nums[j];
                }
            }
            ans[i] = sum;
        }

        return ans;
    }
}