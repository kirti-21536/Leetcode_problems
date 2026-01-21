// Last updated: 1/21/2026, 11:34:00 AM
1class Solution {
2    public boolean doesValidArrayExist(int[] derived) {
3        int xor=0;
4
5        for(int i:derived){
6            xor^=i;
7        }
8        return xor==0;
9        
10    }
11}