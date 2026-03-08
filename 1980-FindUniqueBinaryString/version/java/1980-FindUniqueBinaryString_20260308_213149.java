// Last updated: 3/8/2026, 9:31:49 PM
1class Solution {
2    public String findDifferentBinaryString(String[] nums) {
3        int n = nums.length;
4        StringBuilder ans = new StringBuilder();
5        for(int i = 0; i < n; i++){
6            if(nums[i].charAt(i) == '0')
7                ans.append('1');
8            else
9                ans.append('0');
10        }
11
12        return ans.toString();
13    }
14}