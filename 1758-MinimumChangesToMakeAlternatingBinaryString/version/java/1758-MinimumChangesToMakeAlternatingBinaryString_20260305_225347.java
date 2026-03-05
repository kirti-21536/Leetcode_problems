// Last updated: 3/5/2026, 10:53:47 PM
1class Solution {
2    public int minOperations(String s) {
3        int count1 = 0; 
4        int count2 = 0;
5        
6        for(int i = 0; i < s.length(); i++){
7            char expected1 = (i % 2 == 0) ? '0' : '1';
8            char expected2 = (i % 2 == 0) ? '1' : '0';
9            
10            if(s.charAt(i) != expected1) count1++;
11            if(s.charAt(i) != expected2) count2++;
12        }
13        return Math.min(count1, count2);
14    }
15}