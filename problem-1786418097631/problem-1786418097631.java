// Last updated: 8/11/2026, 8:44:57 AM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int n=nums.length;
4        int prefix=nums[0];
5        for(int i=1;i<n;i++){
6            if(nums[i]==nums[i-1]+1){
7                prefix+=nums[i];
8            }
9            else{
10                break;
11            }
12        }
13        int ans=0;
14        Set<Integer> set=new HashSet<>();
15        for(int i:nums){
16            set.add(i);
17        }
18        for(int i=prefix;i<1000;i++){
19            if(!set.contains(i)){
20                return i;
21            }
22        }
23        return prefix;
24        
25    }
26}