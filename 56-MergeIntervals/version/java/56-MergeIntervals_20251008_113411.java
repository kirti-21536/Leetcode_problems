// Last updated: 10/8/2025, 11:34:11 AM
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)return intervals;
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        
        List<int[]> merged=new ArrayList<>();
        int[] current=intervals[0];
        merged.add(current);
            
        for(int[] arr:intervals){
            if(arr[0]<=current[1]){
                //overlapping 
                current[1]=Math.max(arr[1],current[1]);
            }
            else{
                current=arr;
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);
}}

