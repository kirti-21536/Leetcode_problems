// Last updated: 11/28/2025, 8:02:47 PM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int n=nums.length;
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int ele:nums){
6            map.put(ele,map.getOrDefault(ele,0)+1);
7        }
8        List<Integer> ans=new ArrayList<>();
9        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
10            Integer key=e.getKey();
11            Integer value=e.getValue();
12            if(value>(n/3)){
13                ans.add(key);
14            }
15
16        }
17        return ans;
18    }
19}