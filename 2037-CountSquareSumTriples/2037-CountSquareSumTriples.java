// Last updated: 12/20/2025, 11:55:48 PM
class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int a=1;a<=n;a++){
            for(int b=1;b<=n;b++){
                int c1=a*a+b*b;
                int c=(int)Math.sqrt(c1);
                if(c*c==c1 && c<=n){
                    count++;
                }
            }
        }
        return count;
    }
}