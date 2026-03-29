// Last updated: 3/29/2026, 8:22:19 AM
1class Solution {
2    public int firstMatchingIndex(String s) {
3        int i=0;
4        int j=s.length()-1;
5        while(i<=j){
6            if(s.charAt(i)==s.charAt(j)){
7                return i;
8            }
9            i++;
10            j--;
11        }
12        return -1;
13        
14    }
15}