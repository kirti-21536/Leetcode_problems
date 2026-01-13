// Last updated: 1/13/2026, 11:12:08 AM
class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n=arr.length;
        int left=0;
        while(left<n-1 &&arr[left]<=arr[left+1]){
            left++;
        }
        if(left==n-1)return 0;
        int right=n-1;
        while(right>0 && arr[right-1]<=arr[right]){
            right--;
        }
        // return right-left+1;
        int ans=Math.min(n-left-1,right);
        int i=0,j=right;
        while(i<=left && j<n){
            if(arr[i]<=arr[j]){
                ans=Math.min(ans,j-i-1);
                i++;
            }
            else{
                j++;
            }
        }
        return ans;
        
    }
}