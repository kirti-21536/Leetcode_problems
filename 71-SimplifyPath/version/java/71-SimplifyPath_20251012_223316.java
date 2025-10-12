// Last updated: 10/12/2025, 10:33:16 PM
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String paths[]=path.split("/");
        for(String dir:paths){
            if(dir.equals(".")||dir.equals("")){
                continue;
            }
            else if(dir.equals("..")){
                if(!st.isEmpty())st.pop();
            }
            else{
                st.push(dir);
            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans="/"+st.pop()+ans;
        }
        return ans.length()>0?ans:"/";
    }
}