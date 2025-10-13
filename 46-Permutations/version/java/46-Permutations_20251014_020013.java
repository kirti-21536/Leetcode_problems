// Last updated: 10/14/2025, 2:00:13 AM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res, new boolean[nums.length]);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> res, boolean[] used) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr)); // store a copy
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;            // choose
            curr.add(nums[i]);         // explore
            backtrack(nums, curr, res, used);
            curr.remove(curr.size() - 1); // un-choose
            used[i] = false;           // backtrack
        }
    
        
    }
}