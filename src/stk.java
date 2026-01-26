class stk<t> {

    t[] stack = (t[]) new Object[100];

    int top = -1;
    public  boolean isempty(){
        return top == -1 ;
    }
    public  boolean isfull(){
        return (top == (stack.length -1)) ;
    }
    public  void push(t val){
        if (!isfull()){
            top++;
            stack[top]=val;
        }
        else {
            try {
                throw new RuntimeException("Exception stack is full");
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public  t pop(){
        if (!isempty()){
            t val = stack[top];
            top--;
            return val;
        }else{
            throw new RuntimeException("Exception stack is empty");

        }
    }

    public  t peek(){
        return stack[top];
    }


}
