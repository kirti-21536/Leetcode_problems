// Last updated: 7/30/2026, 5:33:11 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int len=word.length();
4        if(len<=8)return len;
5        else if(len<=16){
6            return 8+2*(len-8);
7        }
8        else if(len<=24){
9            return 8+16+3*(len-16);
10        }
11        else{
12            return 8+16+24+4*(len-24);
13        }
14        
15    }
16}