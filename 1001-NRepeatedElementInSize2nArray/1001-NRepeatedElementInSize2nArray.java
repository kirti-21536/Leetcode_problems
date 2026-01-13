// Last updated: 1/13/2026, 11:13:46 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int uniq=0;
        int freq=0;
        for(Map.Entry<Integer, Integer> e : map.entrySet() ){
            if(e.getValue()>freq){
                uniq=e.getKey();
                freq=e.getValue();
            }
        }
        return uniq;
    }
}