// Last updated: 11/27/2025, 12:22:37 PM
1class Solution {
2    public int smallestNumber(int n) {
3        int num=n;
4        while(num<=Integer.MAX_VALUE){
5            int temp=num;
6            boolean flag=true;
7            String ans="";
8            while(temp>0){
9                int rem=temp%2;
10                ans=rem+ans;
11                temp=temp/2;
12            }
13            for(int i=0;i<ans.length();i++){
14                if(ans.charAt(i)=='0'){
15                    flag=false;
16                    break;
17                }
18            }
19            if(flag){
20                return num;
21            }
22            else{
23                num++;
24            }
25
26        }
27        return n;
28    }
29}