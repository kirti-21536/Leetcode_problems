// Last updated: 3/18/2026, 4:44:08 PM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        Arrays.sort(candidates);
4         int sum=0;
5        List<Integer> ll=new ArrayList<>();
6        List<List<Integer>> ans=new ArrayList<>();
7        solve(candidates,sum,0,ll,ans,target);
8        return ans;
9    }
10    public void solve(int arr[],int sum,int idx,List<Integer> ll,List<List<Integer>> ans,int target){
11        if(sum==target){
12            ans.add(new ArrayList<>(ll));
13            return;
14        }
15        if(sum>target)return;
16        for(int i=idx;i<arr.length;i++){
17            if(i>idx && arr[i]==arr[i-1])continue;
18            ll.add(arr[i]);
19            solve(arr,sum+arr[i],i+1,ll,ans,target);
20            ll.remove(ll.size()-1);
21        }
22    }
23}