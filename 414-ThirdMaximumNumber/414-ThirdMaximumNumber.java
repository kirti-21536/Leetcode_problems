// Last updated: 8/1/2025, 8:14:56 PM
class Solution {
    public int thirdMax(int[] nums) { 
       
        int n=nums.length;
        long v1=Long.MIN_VALUE;
        long v2=Long.MIN_VALUE;
        long v3=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
             if(nums[i]==v1 || nums[i]==v2 ||nums[i]==v3){
            continue;
        }
            if(v1<nums[i]){
                v3=v2;
                v2=v1;
                v1=nums[i];
            }
            else if(nums[i]>v2){
                v3=v2;
                v2=nums[i];
                           }
            else if(nums[i]>v3){
                v3=nums[i];
            }
        }
        if(v3==Long.MIN_VALUE){
            return (int)v1;}
        else return (int)v3;
        

        
    }
}