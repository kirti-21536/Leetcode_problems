// Last updated: 1/21/2026, 11:55:50 AM
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        int a=nums1.length;
4        int b=nums2.length;
5        if(a%2==0 & b%2==0){
6            return 0;
7        }
8        int xor1=0;
9        int xor2=0;
10        for(int i:nums1){
11            xor1^=i;
12        }
13        for(int j:nums2){
14            xor2^=j;
15        }
16        if(a%2==1 &b%2==1){
17            return xor1^xor2;
18        }
19        else if(b%2==1){ //odd wale array ka even pair hoga inka xor 0 hoga
20            return xor1; //isliye yaha se even wala return kra hai kyuki inka odd hoga  and exist karenge 
21        }
22        else{
23            return xor2;
24        }
25        
26    }
27}