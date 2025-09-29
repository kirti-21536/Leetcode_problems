// Last updated: 9/29/2025, 12:07:17 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int arr[]=image[i];
            int m=0;
            int n=image[0].length-1;
            while(m<=n){
                int temp=arr[m];
                arr[m]=arr[n];
                arr[n]=temp;
                m++;
                n--;
            }

        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }
        return image;
        
    }
}