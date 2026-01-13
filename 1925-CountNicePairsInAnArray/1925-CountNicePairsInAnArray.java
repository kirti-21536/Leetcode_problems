// Last updated: 1/13/2026, 11:11:38 AM
class Solution {
    public int countNicePairs(int[] nums) {
        int mod=1000000007;
        Map<Integer,Long> map=new HashMap<>();
        long count=0;
        for(int num:nums){
            int r=rev(num);
            int key=num-r;
            long freq=map.getOrDefault(key,0L);
            count=(count+freq)%mod;
            map.put(key,freq+1);
        }
        return (int)count;
    }
    private int rev(int x){
        int ans=0;
        while(x>0){
            int r=x%10;
            ans=ans*10+r;
            x/=10;
        }
        return ans;
    }
}