// Last updated: 8/28/2025, 1:24:24 AM
class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n=nums.length;
        if(n % k!=0)return false;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int grp=n/k;
        for(int c:map.values()){
            if(c>grp){
                return false;
            }
        }
    return true;
        
        
    }
}