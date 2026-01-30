// Last updated: 1/30/2026, 12:26:02 PM
class Solution {
    public int minimizeXor(int num1, int num2) {
        int setbits=0;
        while(num2!=0){
            num2=(num2 & (num2-1));
            setbits++;
        }
        int x=0;
        for(int i=30;i>=0;i--){
            int mask=(1<<i);
            if((num1&mask)!=0){
                x|=mask;
                setbits--;
                if(setbits==0){
                    return x;
                }
            }
        }
         for(int i=0;i<=30;i++){
            int mask=(1<<i);
            if((num1&mask)==0){
                x|=mask;
                setbits--;
                if(setbits==0){
                    return x;
                }
            }
        }
        return x;
    }
}