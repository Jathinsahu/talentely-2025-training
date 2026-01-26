public class stack_implementation {
    public static void main(String[] args) {
        stk<Integer> st = new stk<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        st.peek();

        // now we cant access the stack arr directly from here as we are using private from here
//        for (int i=0;i<st.top+1;i++){
//            System.out.println(st.stack[i]);
//        }
    }

}
