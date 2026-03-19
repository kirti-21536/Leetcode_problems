// Last updated: 3/19/2026, 12:38:43 PM
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3        Arrays.sort(nums);
4        List<List<Integer>> ans = new ArrayList<>();
5        int n = nums.length;
6
7        for(int i = 0; i < n; i++){
8            if(i > 0 && nums[i] == nums[i-1]) continue;
9
10            for(int j = i + 1; j < n; j++){
11                if(j > i + 1 && nums[j] == nums[j-1]) continue;
12
13                int left = j + 1;
14                int right = n - 1;
15
16                while(left < right){
17                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
18
19                    if(sum == target){
20                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
21
22                        left++;
23                        right--;
24
25                        while(left < right && nums[left] == nums[left-1]) left++;
26                        while(left < right && nums[right] == nums[right+1]) right--;
27
28                    } else if(sum < target){
29                        left++;
30                    } else {
31                        right--;
32                    }
33                }
34            }
35        }
36        return ans;
37    }
38}