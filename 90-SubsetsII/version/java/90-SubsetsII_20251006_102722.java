// Last updated: 10/6/2025, 10:27:22 AM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // sort to group duplicates together
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    
    public void backtrack(int[] nums, int start, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr)); // add current subset
        
        for (int i = start; i < nums.length; i++) {
            // skip duplicate elements
            if (i > start && nums[i] == nums[i - 1]) continue;
            
            curr.add(nums[i]);
            backtrack(nums, i + 1, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}