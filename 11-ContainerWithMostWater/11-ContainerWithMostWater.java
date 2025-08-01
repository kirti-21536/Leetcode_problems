// Last updated: 8/1/2025, 8:16:50 PM
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right = height.length-1;
        int maxArea=0;

        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            maxArea=(Math.max(area,maxArea));
            if(height[left]<height[right])
                left++;
                else
                right--;
        


        }
        return maxArea;

        
    }
}