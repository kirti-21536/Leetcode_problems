// Last updated: 8/27/2025, 12:45:33 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans=0;
        
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int c=0;
                int key=nums[i];
                while(set.contains(key)){
                    set.remove(key);
                    c++;
                    key++;

                }
                ans=Math.max(c,ans);
            }
        }
        return ans;
        

        
    }
}