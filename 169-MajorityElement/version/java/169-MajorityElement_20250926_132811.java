// Last updated: 9/26/2025, 1:28:11 PM
class Solution {
    public int majorityElement(int[] nums) {
        //Moore Voting 
        int candidate=nums[0];
        int vote=1;
        for(int i=0;i<nums.length;i++){
            if(candidate==nums[i]){
                vote++;
            }
            else{
                vote--;
                if(vote==0){
                    candidate=nums[i];
                    vote=1;
                }
            }
        }
        return candidate;
        
    }
}