// Last updated: 9/2/2025, 1:57:50 AM
class Solution {
    public int addDigits(int num) {
        
        while(num>9){
            int sum=0;
            while(num>0){
            int r=num%10;
            sum+=r;
            num/=10;
        }
        num=sum;
        }
        return num;
    }     
}