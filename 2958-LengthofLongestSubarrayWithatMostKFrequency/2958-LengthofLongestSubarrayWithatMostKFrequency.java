// Last updated: 8/12/2026, 9:48:57 AM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        int n=nums.length;
4        int maxLen=0;
5        int left=0;
6        HashMap<Integer,Integer> map=new HashMap<>();
7        for(int right=0;right<n;right++){
8            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
9
10            //window ke invalid hone pe jab tak vo valid na ho jaye tab tak left se window ko shrink karnege
11            while(map.get(nums[right])>k){
12                map.put(nums[left],map.get(nums[left])-1);
13                left++;
14            }
15            maxLen=Math.max(maxLen,right-left+1);
16        }
17        return maxLen;
18    }
19}