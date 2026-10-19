// Last updated: 10/19/2026, 4:30:37 PM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        Arrays.sort(nums);
4        List<Integer> ll=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==target){
7                ll.add(i);
8            }
9        }
10        return ll;
11        
12    }
13}