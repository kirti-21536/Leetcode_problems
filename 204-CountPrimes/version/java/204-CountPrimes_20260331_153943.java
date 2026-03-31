// Last updated: 3/31/2026, 3:39:43 PM
1class Solution {
2    public int countPrimes(int n) {
3        if(n<=2){
4            return 0;
5        }
6        return PrimeSieve(n);
7
8       
9        }
10         public static int PrimeSieve(int n){
11        int ans[]=new int[n];
12        ans[0]=ans[1]=1;//1 is for not prime
13        for(int i=2;i*i<=ans.length;i++){
14            if(ans[i]==0){//i prime h
15                for(int j=2;i*j<ans.length;j++){
16                    ans[i*j]=1;
17                }
18                        }
19        }
20        int c=0;
21        for(int i=2;i<ans.length;i++){
22            if(ans[i]==0){
23                c++;
24            }
25        }
26        return c;
27
28
29    }
30        
31    }