// Last updated: 11/27/2025, 11:46:06 PM
class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& prices[st.peek()]>=prices[i]){
                int j=st.pop();
                ans[j]=prices[j]-prices[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int j=st.pop();
            ans[j]=prices[j];
        }

        return ans;
    }
}