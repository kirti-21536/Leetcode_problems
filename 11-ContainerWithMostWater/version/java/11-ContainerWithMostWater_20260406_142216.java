// Last updated: 4/6/2026, 2:22:16 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left=0;
4        int right = height.length-1;
5        int maxArea=0;
6
7        while(left<right){
8            int area=Math.min(height[left],height[right])*(right-left);
9            maxArea=(Math.max(area,maxArea));
10            if(height[left]<height[right])
11                left++;
12                else
13                right--;
14        
15
16
17        }
18        return maxArea;
19
20        
21    }
22}