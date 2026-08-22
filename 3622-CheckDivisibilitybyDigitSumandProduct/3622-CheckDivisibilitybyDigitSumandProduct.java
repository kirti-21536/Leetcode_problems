// Last updated: 8/22/2026, 6:39:12 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int temp=n;
4        int digit_sum=0;
5        int digit_pro=1;
6        while(temp>0){
7            int rem=temp%10;
8            digit_sum+=rem;
9            digit_pro*=rem;
10            temp/=10;
11        }
12        if(n%(digit_sum+digit_pro) == 0){
13            return true;
14        }
15        return false;
16    }
17}