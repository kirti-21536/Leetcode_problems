// Last updated: 1/6/2026, 11:48:29 AM
1class Solution {
2    public double myPow(double x, int n) {
3        long N=n;
4        if(N<0){
5            x=1/x;
6            N=-N;
7        }
8        double ans=pow(x,N);
9        return ans;
10    }   
11    public double pow(double x,long n){
12        if(n==0)return 1;
13        double half=pow(x,n/2);
14        return n%2==0?half*half:half*half*x;
15    }
16    
17}