// Last updated: 8/1/2025, 8:15:27 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ch=1;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                ch++;
            }
            else{
                ans=Math.max(ans,ch);
                ch=1;
            }
        }
        ans=Math.max(ch,ans);
        if(ans>=2){
            return true;
        }
        else{
            return false;
        }
        
    }
}