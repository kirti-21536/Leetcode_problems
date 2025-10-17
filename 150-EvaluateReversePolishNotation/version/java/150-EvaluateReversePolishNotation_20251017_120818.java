// Last updated: 10/17/2025, 12:08:18 PM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String st:tokens){
            if(st.equals("+") || st.equals("-") || st.equals("*") || st.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                int ans=0;
                switch(st){
                    case "+":ans=a+b;
                    break;
                    case "*":ans=a*b;
                    break;
                    case "-":ans=b-a;
                    break;
                    case "/":ans=b/a;
                    break;                    
                    }
                stack.push(ans);
            }
            else{
                stack.push(Integer.parseInt(st));
            }
        }
        return stack.pop();
        
    }
}