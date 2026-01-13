// Last updated: 1/13/2026, 11:14:57 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2];
        int freq[]=new int[n];
        for(int ele:nums){
            freq[ele-1]++;
        }
        for(int i=0;i<n;i++){
            if(freq[i]==2)ans[0]=i+1;
            if(freq[i]==0)ans[1]=i+1;
        }
      return ans;  
    }
}