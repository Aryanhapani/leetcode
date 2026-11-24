class MinStack {
    Stack<Long> st;
    long min; 

    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int x) {
        if(st.isEmpty()){
            st.push((long)x);
            min=x;
        }else if(x < min){
            st.push(2L * x - min);
            min=x;
        }else{
            st.push((long)x);
        }
        
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        long top=st.pop();

        if(top < min){
            min=2*min - top;
        }
        
    }
    
    public int top() {
        if(st.isEmpty()) return -1;

        long top=st.peek();

        return (top < min)? (int) min :(int) top;
        
    }
    
    public int getMin() {
        if(st.isEmpty()) return -1;
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */