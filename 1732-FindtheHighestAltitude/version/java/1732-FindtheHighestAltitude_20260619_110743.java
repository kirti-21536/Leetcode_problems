// Last updated: 6/19/2026, 11:07:43 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int n=gain.length;
4        int alt[]=new int[n+1];
5        int sum=0;
6        for(int i=0;i<n;i++){
7            sum+=gain[i];
8            alt[i]=sum;
9        }
10        int max=0;
11        for(int a:alt){
12            max=Math.max(a,max);
13        }
14        return max;
15        
16    }
17}