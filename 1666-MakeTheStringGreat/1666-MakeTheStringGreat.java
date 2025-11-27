// Last updated: 11/27/2025, 11:46:04 PM
class Solution {
    public String makeGood(String s) {
       String ans="";
       Stack<Character> st=new Stack<>();
       for(Character ch:s.toCharArray()){
        if(!st.isEmpty()&& Math.abs(st.peek()-ch)==32){
            st.pop();
        }
        else{
            st.push(ch);
        }
       } 
       while(!st.isEmpty()){
        ans=st.pop()+ans+"";
       }
       return ans;
    }
}