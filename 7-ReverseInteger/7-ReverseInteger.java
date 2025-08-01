// Last updated: 8/1/2025, 8:16:53 PM
class Solution {
    public int reverse(int x) {
        int rev =0;
        int t=x;
       
            while(x!=0) 
            { int rem = x %10;
            if(rev>Integer.MAX_VALUE/10|| rev< Integer.MIN_VALUE/10){
            return 0;
        }
              rev = rev*10 +rem;
             x = x/10;
            }
        return rev;  
    }
}