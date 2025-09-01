// Last updated: 9/2/2025, 1:29:18 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1||num==2||num==3||num==5||num==7)return false;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;                    
            }
        }
        if(sum==num)return true;
        return false;
    }
}