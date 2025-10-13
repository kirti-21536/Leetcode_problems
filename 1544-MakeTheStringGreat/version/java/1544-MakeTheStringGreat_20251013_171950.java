// Last updated: 10/13/2025, 5:19:50 PM
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