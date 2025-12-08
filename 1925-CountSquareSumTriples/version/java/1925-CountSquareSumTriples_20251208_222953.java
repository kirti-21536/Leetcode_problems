// Last updated: 12/8/2025, 10:29:53 PM
1class Solution {
2    public int countTriples(int n) {
3        int count=0;
4        for(int a=1;a<=n;a++){
5            for(int b=1;b<=n;b++){
6                int c1=a*a+b*b;
7                int c=(int)Math.sqrt(c1);
8                if(c*c==c1 && c<=n){
9                    count++;
10                }
11            }
12        }
13        return count;
14    }
15}