// Last updated: 8/12/2026, 9:37:25 AM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        if (nums.length == 0) return new int[0];
4
5        int n = nums.length;
6        int prefix[]=new int[n];
7        int suffix[]=new int[n];
8        int[] res = new int[n - k + 1];
9        int max=Integer.MIN_VALUE;
10        for(int i=0;i<n;i++){
11            if(i%k==0){
12                max=nums[i];
13            }
14            max=Math.max(max,nums[i]);
15            prefix[i]=max;
16        }
17        max=Integer.MIN_VALUE;
18        for(int i=n-1;i>=0;i--){
19             if(i%k==0){
20                max=nums[i];
21            }
22            max=Math.max(max,nums[i]);
23            suffix[i]=max;
24        }
25        for(int i=0;i<res.length;i++){
26            res[i]=Math.max(prefix[i+k-1],suffix[i]);
27        }
28
29        //brute force approach with TC O(k*n)
30        // for (int i = 0; i <= n - k; i++) {
31        //     int max = nums[i];
32        //     for (int j = i; j < i + k; j++) {
33        //         max = Math.max(max, nums[j]);
34        //     }
35        //     res[i] = max;
36        // }
37        //optimal approach with TC of O(n)
38        // int ri=0; //result array ki indexing ke liye
39        // Deque<Integer> q=new ArrayDeque<>();
40        // for(int i=0;i<n;i++){
41        //     //remove numbers out of (range k)window size for that index
42        //     if(!q.isEmpty()&& q.peek()==i-k){
43        //         q.poll();
44        //     }
45            //remove smaller numbers in k range as they are of no use
46        //     while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
47        //         q.pollLast();
48        //     }
49        //     q.offer(i);
50        //     if(i>=k-1){
51        //         res[ri++]=nums[q.peek()];
52        //     }
53        // }
54
55        return res;
56        
57    }
58}