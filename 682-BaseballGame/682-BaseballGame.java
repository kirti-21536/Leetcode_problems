// Last updated: 8/1/2025, 8:14:38 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ch=operations[i];
            if(ch.equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(b+a);
            }
            else if(ch.equals("D")){
                st.push(2*st.peek());
            }
            else if(ch.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(ch));
            }
            }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
        
    }
}