// Last updated: 12/27/2025, 8:12:21 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int ans=0,si=0,ei=0,p=1;
4        while(ei<nums.length){
5            //grow
6            p=p*nums[ei];
7        
8        //shrink
9        while(p>=k && si<=ei){
10            p=p/nums[si];
11            si++;
12        }
13        //ans update
14        ans=ans+(ei-si+1);
15        ei++;
16    }
17    return ans;
18        
19    }
20}