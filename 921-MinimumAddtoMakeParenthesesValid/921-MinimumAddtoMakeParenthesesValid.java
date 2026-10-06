// Last updated: 10/6/2026, 11:26:59 AM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        //optimized approach
4        int open=0,add=0;
5        for(char ch:s.toCharArray()){
6            if(ch=='('){
7                open++;
8            }
9            else{ //')'
10                if(open>0)open--;
11                else{
12                    add++;
13                }
14            }
15        }
16        return add+open;
17        // brute force 
18        // Stack<Character> st=new Stack<>();
19        // int count=0; //valid parentheses count
20        // for(char ch:s.toCharArray()){
21        //     if(ch=='('){
22        //         st.push(ch);
23        //     }
24        //     else{
25        //         if(!st.isEmpty() && (st.peek()=='(' && ch==')')){
26        //             st.pop();
27        //             count++;
28        //         }
29        //     }
30        // }
31        // return s.length()-2*count; 
32        
33    }
34}