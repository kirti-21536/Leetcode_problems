// Last updated: 10/8/2026, 11:13:51 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        //optimized code 
4        //to optimize, we will be using a variable in place of stack to maintain the depth
5        int depth=0;
6        StringBuilder ans=new StringBuilder();
7        for(char ch:s.toCharArray()){
8            if(ch=='('){
9                if(depth>0){ // we are talking about an inner bracket if depth>0
10                    ans.append(ch);
11                }
12                //depth==0 then it is the outermost bracket not included in ans
13                depth++;
14            }
15            else{
16                depth--;
17                //depth==0 then is the outermost not included
18                if(depth>0){
19                    ans.append(ch);
20                }
21            }
22        }
23        // Stack<Character> st=new Stack<>();
24        // // here we are using stack to maintain the depth 
25        // StringBuilder ans=new StringBuilder();
26        // for(char ch:s.toCharArray()){
27        //     if(ch=='('){
28        //         if(!st.isEmpty()){
29        //             ans.append(ch);
30        //         }
31        //         st.push(ch);
32        //     }
33        //     else{
34        //         char top=st.pop();
35        //         if(!st.isEmpty()){
36        //             ans.append(ch);
37        //         }
38        //     }
39
40        // }
41        return ans.toString();
42        
43    }
44}