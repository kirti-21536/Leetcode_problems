// Last updated: 8/6/2026, 8:48:43 AM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        for(int i=n;i<1000;i++){
4            int temp=i;
5            int pro=1;
6            while(temp>0){
7                int r=temp%10;
8                pro=pro*r;
9                temp/=10;
10            }
11            if(pro%t==0)return i;
12        }
13        return n;
14    }
15}