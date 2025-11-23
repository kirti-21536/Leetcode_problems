// Last updated: 11/23/2025, 8:43:28 PM
class Solution {
    public int largestRectangleArea(int[] arr) {
        int maxArea=0;
        int n=arr.length;
        Stack<Integer> st=new Stack<>();//for storing bigger values and whenever their nse(next smaller element is found, we calculate their area) 
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