// Last updated: 10/28/2025, 1:39:17 AM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int arr[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            int sum=0;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]=='1'){
                    sum+=1;   
                }
                else{
                    sum=0;
                }
                arr[j][i]=sum;
            }
        }
            int max_area=0;
            for(int k=0;k<matrix.length;k++){
                max_area=Math.max(max_area,largest_histogram(arr[k]));
            }
            return max_area;
        }
        
    public int largest_histogram(int arr[]){
        Stack<Integer> st=new Stack<>(); //pse
	            int maxArea=0;
	            int n=arr.length;
	            for(int i=0;i<n;i++){
	                while(!st.isEmpty()&& arr[i]<arr[st.peek()]){
	                int ele=st.pop();
	                int nse=i;
	                int pse=st.isEmpty()?-1:st.peek();
	                maxArea=Math.max(maxArea,arr[ele]*(nse-pse-1));
	            }
	             st.push(i);
	   
	            }
	                while(!st.isEmpty()){
	                    int nse=n;
	                    int ele=st.pop();
	                    int pse=st.isEmpty()?-1:st.peek();
	                    maxArea=Math.max(maxArea,arr[ele]*(nse-pse-1));
	                }
                return maxArea;

    }        
        }