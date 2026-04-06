// Last updated: 4/6/2026, 2:32:20 PM
1class Solution {
2    public int[] plusOne(int[] digits) { 
3        int n=digits.length;
4        for(int i=digits.length-1;i>=0;i--){
5            if(digits[i]==9){
6                digits[i]=0;
7            }
8            else{
9                digits[i]+=1;
10                return digits;
11            }
12        }
13         digits=new int[digits.length+1];
14        digits[0]=1;
15        return digits;
16	
17        
18    }
19}