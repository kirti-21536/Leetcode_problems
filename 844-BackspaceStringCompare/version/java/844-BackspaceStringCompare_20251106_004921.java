// Last updated: 11/6/2025, 12:49:21 AM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if( s.charAt(i)=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }}
                else{
                    st.push(s.charAt(i));
            }
            
        }
        String s_new="";
        while(!st.isEmpty()){
            s_new+=st.pop();
        }
        Stack<Character> st1=new Stack<>();
        for(int i=0;i<t.length();i++){
            if( t.charAt(i)=='#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }}
                else{
                    st1.push(t.charAt(i));
            }
        }
        String t_new="";
        while(!st1.isEmpty()){
            t_new+=st1.pop();
        }
        return s_new.equals(t_new);
    }
}