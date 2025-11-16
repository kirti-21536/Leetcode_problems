// Last updated: 11/16/2025, 5:08:10 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=0;
        int l=1;
        int m=nums.length;
        int arr[]=new int[m];
        for(int i=0;i<n;i++){
            arr[k]=nums[i];
            arr[l]=nums[i+n];
            k+=2;
            l+=2;
        }
        return arr;
    }
}