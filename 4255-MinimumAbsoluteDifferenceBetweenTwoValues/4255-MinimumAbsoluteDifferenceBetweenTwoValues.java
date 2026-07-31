// Last updated: 8/1/2026, 12:01:28 AM
class Solution {
    public int minAbsoluteDifference(int[] nums) {
        List<Integer> idx1=new ArrayList<>();
        List<Integer> idx2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                idx1.add(i);
            }
            if(nums[i]==2){
                idx2.add(i);
            }
        }
        if(idx1.isEmpty()||idx2.isEmpty())return -1;
        int min=Integer.MAX_VALUE;
        
        for(int a:idx1){
            for(int b:idx2){
                min=Math.min(Math.abs(a-b),min);
            }
        }
        return min;
        
    }
}