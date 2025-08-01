// Last updated: 8/1/2025, 8:15:31 PM
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        return PrimeSieve(n);

       
        }
         public static int PrimeSieve(int n){
        int ans[]=new int[n];
        ans[0]=ans[1]=1;//1 is for not prime
        for(int i=2;i*i<=ans.length;i++){
            if(ans[i]==0){//i prime h
                for(int j=2;i*j<ans.length;j++){
                    ans[i*j]=1;
                }
                        }
        }
        int c=0;
        for(int i=2;i<ans.length;i++){
            if(ans[i]==0){
                c++;
            }
        }
        return c;


    }
        
    }