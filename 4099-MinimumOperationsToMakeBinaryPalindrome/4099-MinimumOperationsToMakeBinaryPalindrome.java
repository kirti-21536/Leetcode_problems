// Last updated: 12/20/2025, 11:55:26 PM
class Solution {
    public int[] minOperations(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=minOps(nums[i]);
        }
        return ans;
    }
    private int minOps(int num){
        if(isBinPalindrome(num))return 0;
        int steps=1;
        int max=1<<(Integer.toBinaryString(num).length()+1);
        while(num+steps<=max){
            if(num-steps>=0 && isBinPalindrome(num-steps))return steps;
            if(isBinPalindrome(num+steps))return steps;
            steps++;
        }
        return steps;
    }
    private boolean isBinPalindrome(int num){
        String bin=Integer.toBinaryString(num);
        int l=0;
        int r=bin.length()-1;
        while(l<r){
            if(bin.charAt(l)!=bin.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}