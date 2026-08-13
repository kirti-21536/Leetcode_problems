// Last updated: 8/13/2026, 1:41:59 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        // O(N logN)
4        if(nums.length==0)return 0;
5        Arrays.sort(nums);
6        int count=1;
7        int ans=1;
8        for(int i=1;i<nums.length;i++){
9            if(nums[i]==nums[i-1])continue;
10            if(nums[i]==nums[i-1]+1){
11                count++;
12            }
13            else{
14                count=1;
15            }
16            ans=Math.max(ans,count);
17        }
18        return ans;
19
20        // tc= O(n)
21        // Set<Integer> set=new HashSet<>();
22        // for(int i=0;i<nums.length;i++){
23        //     set.add(nums[i]);
24        // }
25        // int ans=0;
26        // for(int i=0;i<nums.length;i++){
27        //     if(!set.contains(nums[i]-1)){
28        //         int c=0;
29        //         int key=nums[i];
30        //         while(set.contains(key)){
31        //             set.remove(key);
32        //             c++;
33        //             key++;
34        //         }
35        //         ans=Math.max(c,ans);
36        //     }
37        // }
38        // return ans;   
39    }
40}