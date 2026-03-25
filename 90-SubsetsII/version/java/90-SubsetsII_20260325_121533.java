// Last updated: 3/25/2026, 12:15:33 PM
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        List<Integer> ll=new ArrayList<>();
4        List<List<Integer>> ans=new ArrayList<>();
5        Arrays.sort(nums);
6        solve(nums,0,ll,ans);   
7        return ans;     
8    }
9    public void solve(int nums[],int i,List<Integer> ll,List<List<Integer>> ans){
10       if(i==nums.length){
11        if(!ans.contains(ll)){
12            ans.add(new ArrayList<>(ll));
13        }
14        return;
15       }
16       solve(nums,i+1,ll,ans);
17       ll.add(nums[i]);
18       solve(nums,i+1,ll,ans);
19       ll.remove(ll.size()-1);
20        
21    }
22}