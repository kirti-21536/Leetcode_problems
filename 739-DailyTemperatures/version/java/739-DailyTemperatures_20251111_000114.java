// Last updated: 11/11/2025, 12:01:14 AM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st=new Stack<>();
        int n=temp.length; 
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temp[st.peek()]<temp[i]){
                int c=st.pop();
                ans[c]=i-c;
            }
            st.push(i);

        }
        while(!st.isEmpty()){
            ans[st.pop()]=0;
        }

        return ans;
    }
}