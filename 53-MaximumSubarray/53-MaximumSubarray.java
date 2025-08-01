// Last updated: 8/1/2025, 8:16:18 PM
class Solution {
    public int maxSubArray(int[] nums) {
        
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            
                sum+=nums[i];
                ans=Math.max(ans,sum);
                if(sum<0){
                  sum=0;
                  }
            }
        return ans;

    
    }
}