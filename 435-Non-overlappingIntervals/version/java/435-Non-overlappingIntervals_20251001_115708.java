// Last updated: 10/1/2025, 11:57:08 AM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int remove=0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int prev=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<prev){
                remove++;
            }
            else{
                prev=intervals[i][1];
            }
        }
        return remove;
    }
}