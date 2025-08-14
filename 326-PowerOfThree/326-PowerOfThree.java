// Last updated: 8/14/2025, 11:48:12 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)return false;
        while(n!=1){
           if(n%3!=0){
            return false;
           }
           n=n/3;
           
        }
        return true;
        
    }
}