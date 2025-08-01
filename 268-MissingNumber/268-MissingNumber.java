// Last updated: 8/1/2025, 8:15:13 PM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length!=nums[nums.length-1])return nums.length;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=n){
                return n;
            }
            
            n++;
        }
        return 0;

    }
    }