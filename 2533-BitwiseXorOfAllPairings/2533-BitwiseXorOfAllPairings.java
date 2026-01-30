// Last updated: 1/30/2026, 12:26:00 PM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        if(a%2==0 & b%2==0){
            return 0;
        }
        int xor1=0;
        int xor2=0;
        for(int i:nums1){
            xor1^=i;
        }
        for(int j:nums2){
            xor2^=j;
        }
        if(a%2==1 &b%2==1){
            return xor1^xor2;
        }
        else if(b%2==1){ //odd wale array ka even pair hoga inka xor 0 hoga
            return xor1; //isliye yaha se even wala return kra hai kyuki inka odd hoga  and exist karenge 
        }
        else{
            return xor2;
        }
        
    }
}