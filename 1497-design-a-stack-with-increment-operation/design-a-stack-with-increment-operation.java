class CustomStack {
    int[] arr;
    int index=-1;


    public CustomStack(int maxSize) {
             arr = new int[maxSize]; 
    }
    
    public void push(int x) {
        if(index==arr.length-1){
            return;
        }

        index++;
        arr[index]=x;
    }
    
    public int pop() {
        if(index==-1){
            return -1;
        }

        int element=arr[index];
        index--;

        return element;
        
    }
    
    public void increment(int k, int val) {
        int limit=Math.min(k,index+1);

        for(int i=0;i<limit;i++){
            arr[i]+=val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */