// Last updated: 8/25/2026, 9:47:10 AM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        Set<Integer> set=new HashSet<>();
4        for(int a:nums){
5            set.add(a);
6        }
7        for(int i=1;i<=100;i++){
8            if(!set.contains(k*i))return k*i;
9        }
10        return 101;
11        
12    }
13}