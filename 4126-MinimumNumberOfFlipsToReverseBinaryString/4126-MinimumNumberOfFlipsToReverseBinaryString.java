// Last updated: 11/27/2025, 11:45:33 PM
class Solution {
    public int minimumFlips(int n) {
        int len=0;
        StringBuilder s=new StringBuilder();
        while(n!=0){
            int r=n%2;
            s.append(r);
            n/=2;
            len++;
        }
        StringBuilder rev=new StringBuilder(s).reverse();
        int count=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)!=rev.charAt(i))count++;
        }
        return count;
        
    }
}