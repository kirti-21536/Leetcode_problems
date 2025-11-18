// Last updated: 11/18/2025, 10:45:23 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
                if(i==j)continue;    
            }
            ans[i]=count;
        }
        return ans;
        
    }
}