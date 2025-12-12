// Last updated: 12/13/2025, 12:21:16 AM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        int remove=0;
4        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
5        int end=intervals[0][1];
6        for(int i=1;i<intervals.length;i++){
7            if(intervals[i][0]<end){
8                remove++;
9            }
10            else{
11                end=intervals[i][1];
12            }
13        }
14        return remove;
15    }
16}