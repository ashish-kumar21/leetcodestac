

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

 class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    //push : 0(n)
    public void push(int x) {
        q.offer(x); //1. Naya element daalo last mai

        //2. usle phle wala sare element ko nikal peeche daal do
        int size = q.size();
        for(int i = 0; i< size - 1; i++){
            q.offer(q.poll());
        }
    }
    //pop: o(1)
    public int pop()
     {
        return q.poll(); // queqe ka front nikalo
    }
    //top:o(1)
    public int top(){
        return q.peek(); // queue ka front dekho
    }
    // Empty : o(1)
    public boolean empty(){
        return q.isEmpty ();
    }
 }