// Last updated: 8/27/2025, 1:10:07 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int m=dimensions.length;
        int maxarea=0;
        double maxdia=0;
        for(int i=0;i<m;i++){
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            double dia =Math.sqrt(l*l+w*w);
            int area=l*w;
            if(dia>maxdia || (dia==maxdia && area>maxarea)){
                maxdia=dia;
                maxarea=area;
            }
        }
        return maxarea;
 
    
        
        
    }
}