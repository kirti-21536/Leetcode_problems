// Last updated: 8/1/2025, 8:16:13 PM
class Solution {
    public int[] plusOne(int[] digits) { 
        int n=digits.length;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }
            else{
                digits[i]+=1;
                return digits;
            }
        }
         digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
	
        
    }
}