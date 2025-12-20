// Last updated: 12/20/2025, 11:55:25 PM
class Solution {
    public boolean completePrime(int num) {
        if(!isPrime(num))return false;
        String s=String.valueOf(num);
        int n=s.length();
        for(int i=1;i<=n;i++){
            int pre=Integer.parseInt(s.substring(0,i));
            if(!isPrime(pre))return false;
        }
        for(int i=1;i<n;i++){
            int suff=Integer.parseInt(s.substring(i));
            if(!isPrime(suff))return false;
        }
        return true;
    }
    public boolean isPrime(int n){
        if(n<=1)return false;
        if(n==2)return true;
        if(n%2==0)return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0)return false;
        }
        return true;
    }
}