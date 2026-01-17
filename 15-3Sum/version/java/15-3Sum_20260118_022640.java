// Last updated: 1/18/2026, 2:26:40 AM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums); // Sort the array
4        List<List<Integer>> result = new ArrayList<>();
5
6        int n = nums.length;
7
8        for (int i = 0; i < n - 2; i++) {
9            // Skip duplicate elements for i
10            if (i > 0 && nums[i] == nums[i - 1]) continue;
11
12            int left = i + 1;
13            int right = n - 1;
14
15            while (left < right) {
16                int total = nums[i] + nums[left] + nums[right];
17
18                if (total < 0) {
19                    left++;
20                } else if (total > 0) {
21                    right--;
22                } else {
23                    // Found a triplet
24                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
25
26                    // Skip duplicates for left
27                    while (left < right && nums[left] == nums[left + 1]) left++;
28                    // Skip duplicates for right
29                    while (left < right && nums[right] == nums[right - 1]) right--;
30
31                    // Move both pointers
32                    left++;
33                    right--;
34                }
35            }
36        }
37
38        return result;
39    }
40}