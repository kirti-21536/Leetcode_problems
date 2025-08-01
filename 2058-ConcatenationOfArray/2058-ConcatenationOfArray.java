// Last updated: 8/1/2025, 8:14:10 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[nums.length*2];
        int i=0;
        for(;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int k=0;
        while(i<ans.length && k<nums.length){
            ans[i]=nums[k];
            i++;
            k++;
        }
        return ans;
    }
}