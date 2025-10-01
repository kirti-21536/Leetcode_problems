// Last updated: 10/1/2025, 10:49:57 AM
class Solution {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        if(n==0)return 0;

        //sorting 2D array using comparator
        // on the basis of their end points
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        //first array 's endpoint to check overlapping
        int ei=points[0][1];
        int arrows=1;
        for(int i=1;i<points.length;i++){
            if(points[i][0]>ei){ //any starting point is not overlapping with the end point
                arrows++;
                ei=points[i][1]; //end point is replaced with current array's end point
            }
        }
                   
        return arrows;
        
    }
}