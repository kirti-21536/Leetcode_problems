// Last updated: 1/2/2026, 10:46:46 AM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        Map<Integer,Integer> map=new HashMap<>();
4        for(int ele:nums){
5            map.put(ele,map.getOrDefault(ele,0)+1);
6        }
7        int uniq=0;
8        int freq=0;
9        for(Map.Entry<Integer, Integer> e : map.entrySet() ){
10            if(e.getValue()>freq){
11                uniq=e.getKey();
12                freq=e.getValue();
13            }
14        }
15        return uniq;
16    }
17}