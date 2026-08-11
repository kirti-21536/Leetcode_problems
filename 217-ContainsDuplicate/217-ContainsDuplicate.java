// Last updated: 8/11/2026, 10:08:55 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        int n=nums.length;
4        HashSet<Integer> set=new HashSet<>();
5        for(int a:nums){
6            set.add(a);
7        }
8        return set.size()!=n;
9        // Arrays.sort(nums);
10        // for(int i=1;i<n;i++){
11        //     if(nums[i]==nums[i-1])return true;
12        // }
13        // for(int i=0;i<n;i++){
14        //     for(int j=i+1;j<n;j++){
15        //         if(nums[i]==nums[j])return true;
16        //     }
17        // }
18        // return false;
19        
20    }
21}