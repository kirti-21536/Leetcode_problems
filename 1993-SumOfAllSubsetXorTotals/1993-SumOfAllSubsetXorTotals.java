// Last updated: 1/13/2026, 11:11:34 AM
class Solution {
    
    public int subsetXORSum(int[] nums) {
        return solve(nums,0,0);  
    }
    public static int solve(int []nums,int i,int xor){
        if(i==nums.length){
            return xor;
        }
    int inc=solve(nums,i+1,xor^nums[i]);
    int exc=solve(nums,i+1,xor);
    return inc+exc;
}
}