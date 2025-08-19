// Last updated: 8/19/2025, 10:38:08 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long total=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            if(nums[i]!=0){
                total=total+count*(count+1)/2;
                count=0;
            }
        }
        total+=count*(count+1)/2;
        return total;

        
    }
}