// Last updated: 8/4/2026, 9:04:09 AM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int max=Integer.MIN_VALUE;
4        int min=Integer.MAX_VALUE;
5        HashSet<Integer> set=new HashSet<>();
6        for(int i:nums){
7            max=Math.max(i,max);
8            min=Math.min(i,min);
9            set.add(i);
10        }
11        
12        List<Integer> ans=new ArrayList<>();
13        for(int i=min;i<=max;i++){
14            if(!set.contains(i)){
15                ans.add(i);
16            }
17        }
18        return ans;
19    }
20}