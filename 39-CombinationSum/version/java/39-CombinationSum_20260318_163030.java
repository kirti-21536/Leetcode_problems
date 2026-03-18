// Last updated: 3/18/2026, 4:30:30 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        int sum=0;
4        List<Integer> ll=new ArrayList<>();
5        List<List<Integer>> ans=new ArrayList<>();
6        solve(candidates,sum,0,ll,ans,target);
7        return ans;
8    }
9    public void solve(int arr[],int sum,int idx,List<Integer> ll,List<List<Integer>> ans,int target){
10        if(sum==target){
11            ans.add(new ArrayList<>(ll));
12            return;
13        }
14        if(sum>target)return;
15        for(int i=idx;i<arr.length;i++){
16            ll.add(arr[i]);
17            solve(arr,sum+arr[i],i,ll,ans,target);
18            ll.remove(ll.size()-1);
19        }
20    }
21}