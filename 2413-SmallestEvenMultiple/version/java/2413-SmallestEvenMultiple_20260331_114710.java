// Last updated: 3/31/2026, 11:47:10 AM
1class Solution {
2    public int smallestEvenMultiple(int n) {
3        if(n%2==0){
4            return n;
5        }
6        return n*2;
7        
8    }
9    public int gcd(int a,int b){
10        while(b!=0){
11            int temp=b;
12            b=a%b;
13            a=temp;
14        }
15        return a;
16    }
17}