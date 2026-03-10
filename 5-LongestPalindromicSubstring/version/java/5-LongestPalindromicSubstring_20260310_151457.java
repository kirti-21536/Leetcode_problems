// Last updated: 3/10/2026, 3:14:57 PM
1class Solution {
2    public int myAtoi(String s) {
3        s=s.trim();
4        if(s.length()==0)return 0;
5        int i=0;
6        int sign=1;
7        if(s.charAt(i)=='-'){
8            sign=-1;
9            i++;
10        }
11        else if(s.charAt(i)=='+'){
12                i++;   
13        }
14        int ans=0;
15        while(i<s.length() && isdigit(s.charAt(i))){
16            int digit=s.charAt(i)-'0';
17            if(ans>(Integer.MAX_VALUE-digit)/10){
18                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
19            }
20            ans=ans*10+digit;
21            i++;
22        }
23        return sign*ans;    
24}
25public boolean isdigit(char ch){
26    if(ch>='0' && ch<='9')return true;
27    return false;
28}
29    }
30    