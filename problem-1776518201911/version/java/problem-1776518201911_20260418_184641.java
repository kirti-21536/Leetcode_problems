// Last updated: 4/18/2026, 6:46:41 PM
1class Solution {
2    public int mirrorDistance(int n) {
3        return Math.abs(n-reverse(n));
4    }
5    public int reverse(int n){
6        int ans=0;
7        while(n>0){
8            int r=n%10;
9            ans=ans*10+r;
10            n/=10;
11        }
12        return ans;
13    }
14}