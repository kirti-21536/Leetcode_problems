// Last updated: 4/22/2026, 3:30:42 PM
1class Solution {
2    public String simplifyPath(String path) {
3        Stack<String> st=new Stack<>();
4        String paths[]=path.split("/");
5        for(String dir:paths){
6            if(dir.equals(".")||dir.equals("")){
7                continue;
8            }
9            else if(dir.equals("..")){
10                if(!st.isEmpty())st.pop();
11            }
12            else{
13                st.push(dir);
14            }
15        }
16        String ans="";
17        while(!st.isEmpty()){
18            ans="/"+st.pop()+ans;
19        }
20        return ans.length()>0?ans:"/";
21    }
22}