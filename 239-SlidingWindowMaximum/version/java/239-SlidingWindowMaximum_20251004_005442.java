// Last updated: 10/4/2025, 12:54:42 AM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];

        int n = nums.length;
        int[] res = new int[n - k + 1];

        //brute force approach with TC O(k*n)
        // for (int i = 0; i <= n - k; i++) {
        //     int max = nums[i];
        //     for (int j = i; j < i + k; j++) {
        //         max = Math.max(max, nums[j]);
        //     }
        //     res[i] = max;
        // }
        //optimal approach with TC of O(n)
        int ri=0; //result array ki indexing ke liye
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            //remove numbers out of (range k)window size for that index
            if(!q.isEmpty()&& q.peek()==i-k){
                q.poll();
            }
            //remove smaller numbers in k range as they are of no use
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                res[ri++]=nums[q.peek()];
            }
        }

        return res;
        
    }
}