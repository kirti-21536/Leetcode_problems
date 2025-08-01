// Last updated: 8/1/2025, 8:16:51 PM
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int t=x;
        while(x>0){
            int r=x%10;
            rev=rev*10+r;
            x=x/10;
            
        }
        if(rev==t){
            return true;
        }
        else{
        return false;
        }
    }
}