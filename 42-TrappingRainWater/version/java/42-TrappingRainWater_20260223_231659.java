// Last updated: 2/23/2026, 11:16:59 PM
1class Solution {
2    public int trap(int[] height) {
3        int n=height.length;
4        int left[]=new int[n];
5        int right[]=new int[n];
6        left[0]=height[0];
7        for(int i=1;i<n;i++){
8            left[i]=Math.max(left[i-1],height[i]);
9        }
10        right[n-1]=height[n-1];
11        for(int i=n-2;i>=0;i--){
12            right[i]=Math.max(right[i+1],height[i]);
13        }
14        int sum=0;
15        for(int i=0;i<n;i++){
16            sum+=Math.min(left[i],right[i])-height[i];
17        }
18        return sum;
19
20        
21    }
22}