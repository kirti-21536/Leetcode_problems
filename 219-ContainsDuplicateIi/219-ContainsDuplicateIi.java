// Last updated: 8/1/2025, 8:15:25 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int j=map.get(nums[i]);
                if(Math.abs(i-j)<=k){
                    return true;
                }
                else{
                   map.put(nums[i],i); 
                }
            }
            else{
                map.put(nums[i],i);
            }
            
        }
        return false;
        
        
    }
}