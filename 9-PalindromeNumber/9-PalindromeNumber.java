// Last updated: 8/12/2026, 2:10:38 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        String s = String.valueOf(x);
4        int i=0;
5        int j=s.length()-1;
6        while(i<j){
7            if(s.charAt(i)!=s.charAt(j))return false;
8            i++;
9            j--;
10        }
11        return true;
12        //int rev=0;
13        //int t=x;
14        // while(x>0){
15        //     int r=x%10;
16        //     rev=rev*10+r;
17        //     x=x/10;
18            
19        // }
20        // if(rev==t){
21        //     return true;
22        // }
23        // else{
24        // return false;
25        // }
26        
27        
28    }
29}