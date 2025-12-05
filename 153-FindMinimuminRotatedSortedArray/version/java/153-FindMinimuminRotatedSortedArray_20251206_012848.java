// Last updated: 12/6/2025, 1:28:48 AM
class Solution {
    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length-1;

        if(nums[left]<=nums[right]){
            return nums[left];
        }

        while(left<=right){
            int mid = left+(right-left);

            if(mid>0 && nums[mid]<=nums[mid-1])return nums[mid];
            if(mid<nums.length-1 && nums[mid]>=nums[mid+1])return nums[mid+1];

            if(nums[mid]>nums[right]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
















    //   int left = 0;
    //   int right = nums.length-1;

    //   if (nums[left] <= nums[right]) {
    //         return nums[left];
    //     }

    //     while(left<right){
    //         int mid = left+(right-left)/2;

    //         if(mid>0 && nums[mid]<nums[mid-1])return nums[mid];

    //         if(mid<nums.length && nums[mid]>nums[mid+1])return nums[mid+1];

    //         if(nums[mid]>=nums[right]){
    //             left = mid+1;
    //         }else{
    //             right = mid-1;
    //         }
    //     }
    //     return -1;
    }
}