// Last updated: 8/1/2026, 8:04:08 PM
1class Solution {
2    public int countValidPrefixes(String s) {
3        int cz=0,co=0;
4        int ans=0;
5        for(char ch:s.toCharArray()){
6            if(ch=='0')cz++;
7            else co++;
8            if(Math.abs(cz-co)<=1)ans++;
9        }
10        return ans;
11    }
12}