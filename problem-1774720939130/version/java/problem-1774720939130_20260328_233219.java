// Last updated: 3/28/2026, 11:32:19 PM
1class Solution {
2    public int minAbsoluteDifference(int[] nums) {
3        List<Integer> idx1=new ArrayList<>();
4        List<Integer> idx2=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                idx1.add(i);
8            }
9            if(nums[i]==2){
10                idx2.add(i);
11            }
12        }
13        if(idx1.isEmpty()||idx2.isEmpty())return -1;
14        int min=Integer.MAX_VALUE;
15        
16        for(int a:idx1){
17            for(int b:idx2){
18                min=Math.min(Math.abs(a-b),min);
19            }
20        }
21        return min;
22        
23    }
24}