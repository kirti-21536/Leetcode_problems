// Last updated: 1/21/2026, 12:08:21 PM
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor1=0,xor2=0;
4        for(int k:arr1){
5            xor1^=k;
6        }
7        for(int i:arr2){
8            xor2^=i;
9        }
10        return xor1&xor2;
11    }
12}