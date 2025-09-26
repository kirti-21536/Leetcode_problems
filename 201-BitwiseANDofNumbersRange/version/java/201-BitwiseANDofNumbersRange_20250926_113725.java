// Last updated: 9/26/2025, 11:37:25 AM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int count=0;
        while(left<right){
            left=left>>1;
            right=right>>1;
            count++;
            
        }
        left=left<<count;
        return left;
    }
}