// Last updated: 10/14/2025, 1:31:54 AM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long lo=1;
        long hi=(long)min(time)*totalTrips;
        long ans=hi;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(cancomplete(time,totalTrips,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public int min(int []time){
        int min=time[0];
        for(int t:time){
            min=Math.min(min,t);
        }
        return min;
    }
    public boolean cancomplete(int time[],int totalTrips,long mid){
        long trips=0;
        for(int t:time){
            trips+=mid/t;     
            if(trips>=totalTrips)return true;   
            }
            return false;
    }
}