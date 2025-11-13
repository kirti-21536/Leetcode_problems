// Last updated: 11/14/2025, 1:09:17 AM
class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)return "0";
        if(k==0)return num;
        Stack<Character> st=new Stack<>();

        for(char ch:num.toCharArray()){
            while(!st.isEmpty()&& k>0 && st.peek()>ch){
                st.pop();
                k--;
            } 
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }

        StringBuilder s=new StringBuilder();
        for(char ch:st)s.append(ch);

        while(s.length()>0 && s.charAt(0)=='0'){
            s.deleteCharAt(0);
        }
        return s.length()==0?"0":s.toString();
    }
}