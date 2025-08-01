// Last updated: 8/1/2025, 8:14:15 PM
class Solution {
    public boolean check(int[] nums) {
        int rotate=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]) rotate++;
        
        if(rotate>1){
            return false;
        }
    }
    return true;
    }
}