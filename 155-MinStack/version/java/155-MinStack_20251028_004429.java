// Last updated: 10/28/2025, 12:44:29 AM
class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;

    public MinStack() {
        st=new Stack<>();
        minst=new Stack<>();    
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty()){
            minst.push(val);
        }
        else{
            minst.push(Math.min(val,minst.peek()));
        }
    }
    
    public void pop() {
        st.pop();
        minst.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */