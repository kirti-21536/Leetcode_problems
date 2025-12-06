// Last updated: 12/6/2025, 8:38:40 PM
1class Solution {
2    public boolean completePrime(int num) {
3        if(!isPrime(num))return false;
4        String s=String.valueOf(num);
5        int n=s.length();
6        for(int i=1;i<=n;i++){
7            int pre=Integer.parseInt(s.substring(0,i));
8            if(!isPrime(pre))return false;
9        }
10        for(int i=1;i<n;i++){
11            int suff=Integer.parseInt(s.substring(i));
12            if(!isPrime(suff))return false;
13        }
14        return true;
15    }
16    public boolean isPrime(int n){
17        if(n<=1)return false;
18        if(n==2)return true;
19        if(n%2==0)return false;
20        for(int i=3;i*i<=n;i+=2){
21            if(n%i==0)return false;
22        }
23        return true;
24    }
25}