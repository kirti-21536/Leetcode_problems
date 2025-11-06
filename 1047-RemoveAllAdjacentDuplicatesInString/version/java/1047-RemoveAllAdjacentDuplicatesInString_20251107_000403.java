// Last updated: 11/7/2025, 12:04:03 AM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray()){
            if(!st.isEmpty() && i==st.peek()){
                st.pop();
                continue;
            }
            st.push(i);
        }
        String str="";
        while(!st.isEmpty()){
            str=st.pop()+str+"";
        }
        return str;

    }
}
