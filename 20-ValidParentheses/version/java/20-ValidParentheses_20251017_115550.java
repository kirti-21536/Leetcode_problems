// Last updated: 10/17/2025, 11:55:50 AM
class Solution {
    public boolean isValid(String s) {
      
        //      while(true){
        //     if(s.contains("()"))s=s.replace("()","");
        //     else if(s.contains("{}"))s=s.replace("{}","");
        //     else if(s.contains("[]"))s=s.replace("[]","");
        //     else return s.isEmpty();
        // }
        if(s.length()==1)return false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='(' || ch=='{' || ch=='[')st.push(ch);
            else{
                if(st.isEmpty())return false;
                if(ch==')'&& st.peek()=='('
                ||ch=='}' && st.peek()=='{'
                ||ch==']'&& st.peek()=='['){
                    st.pop();
                }  
                else{
                        return false;
                    } 
            }
        }
        if(st.isEmpty())return true;
        return false;
   
    }
}