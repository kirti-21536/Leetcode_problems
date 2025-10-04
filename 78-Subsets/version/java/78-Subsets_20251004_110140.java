// Last updated: 10/4/2025, 11:01:40 AM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        print(nums , 0, ll, ans);
        return ans;
    }
    public static void print(int nums[], int start, List<Integer> ll, List<List<Integer>> res){
        if(start==nums.length){
            res.add(new ArrayList<>(ll));
            return;
        }
        ll.add(nums[start]);
        print(nums, start+1, ll, res);
        ll.remove(ll.size()-1);
        print(nums,start+1,ll,res);
        }
}