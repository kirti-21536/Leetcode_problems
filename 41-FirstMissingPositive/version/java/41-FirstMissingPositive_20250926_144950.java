// Last updated: 9/26/2025, 2:49:50 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int i:nums){
            if(i>0){
                set.add(i);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return nums.length+1;
        
    }
}