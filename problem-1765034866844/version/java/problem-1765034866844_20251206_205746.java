// Last updated: 12/6/2025, 8:57:46 PM
1class Solution {
2    public int[] minOperations(int[] nums) {
3        int n=nums.length;
4        int ans[]=new int[n];
5        for(int i=0;i<n;i++){
6            ans[i]=minOps(nums[i]);
7        }
8        return ans;
9    }
10    private int minOps(int num){
11        if(isBinPalindrome(num))return 0;
12        int steps=1;
13        int max=1<<(Integer.toBinaryString(num).length()+1);
14        while(num+steps<=max){
15            if(num-steps>=0 && isBinPalindrome(num-steps))return steps;
16            if(isBinPalindrome(num+steps))return steps;
17            steps++;
18        }
19        return steps;
20    }
21    private boolean isBinPalindrome(int num){
22        String bin=Integer.toBinaryString(num);
23        int l=0;
24        int r=bin.length()-1;
25        while(l<r){
26            if(bin.charAt(l)!=bin.charAt(r))return false;
27            l++;
28            r--;
29        }
30        return true;
31    }
32}