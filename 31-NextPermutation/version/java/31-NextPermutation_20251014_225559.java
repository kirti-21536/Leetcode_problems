// Last updated: 10/14/2025, 10:55:59 PM
class Solution {
    public void nextPermutation(int[] nums) {
        int p=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            Reverse(nums,0,n-1);
            return;
        }
        int q=-1;
        for(int i=n-1;i>p;i--){
            if(nums[i]>nums[p]){
            q=i;
            break;
        }
    }
    //swap p&q
    int temp=nums[p];
    nums[p]=nums[q];
    nums[q]=temp;
    Reverse(nums,p+1,n-1);

    }
    public static void Reverse(int[] nums,int i,int j) {
		
		while (i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;

		}
    }
}