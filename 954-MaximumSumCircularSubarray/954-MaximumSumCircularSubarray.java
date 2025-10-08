// Last updated: 10/8/2025, 11:35:05 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum1=0;
        int max=Integer.MIN_VALUE;
        //Kadene's algo
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            if(sum1>max){
                max=sum1;
            }
            if(sum1<0){
                sum1=0;
            } 

        }
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        int sum=0;
        int max1=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int c=nums[i]*-1;
            sum+=c;
            if(sum>max1){
                max1=sum;
            }
            if(sum<0){
                sum=0;
            } 

        }
        int ans=max1+s;
        if(ans==0){
            return max;
        }
        return Math.max(max,ans);
        
    }
}