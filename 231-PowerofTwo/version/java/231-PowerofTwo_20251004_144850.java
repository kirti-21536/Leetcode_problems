// Last updated: 10/4/2025, 2:48:50 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        while(n>1){
            if(n%2!=0) return false;
            n=n/2;
        }
        return true;

        
    }
}