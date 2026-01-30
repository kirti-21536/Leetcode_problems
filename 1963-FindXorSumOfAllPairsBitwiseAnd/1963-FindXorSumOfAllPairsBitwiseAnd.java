// Last updated: 1/30/2026, 12:26:26 PM
class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1=0,xor2=0;
        for(int k:arr1){
            xor1^=k;
        }
        for(int i:arr2){
            xor2^=i;
        }
        return xor1&xor2;
    }
}