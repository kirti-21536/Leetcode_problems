// Last updated: 10/12/2025, 12:10:42 AM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int counter[]=new int[2];
        for(int i=0;i<bills.length;i++){
            int val=bills[i];
            if(bills[i]==5){
                counter[0]++;
            }
            else if(bills[i]==10){
                if(counter[0]>0){
                    counter[0]--;
                    counter[1]++;
                }else{
                    return false;
                }
            }
            else if(bills[i]==20){
                if(counter[0]>0 && counter[1]>0){
                    counter[0]--;
                    counter[1]--;
                }
                else if(counter[0]>=3){
                    counter[0]=counter[0]-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
}