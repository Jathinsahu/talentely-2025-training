public class max_histogram {
    public static void main(String[] args) {
        stk<Integer> st = new stk<>();

        st.push(2);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(2);
        st.push(4);
        st.push(7);
        st.push(8);
        st.push(5);
        st.push(3);

        int area=0;
        int curr;
        int ind;


        for (int i=0;i<=st.top;i++){
            if (i== st.top){
                curr = 0;
            }else{
                curr = st.stack[i+1];
            }
            if (curr < st.stack[i]){
                ind=i;
                int min=Integer.MAX_VALUE;
                int count = 0;
                while(st.stack[ind] > curr){
                    count++;
                    min = Math.min(st.stack[ind],min);
                    area = Math.max(area,min*count);
                    ind--;
                    if (ind==-1) break;
                }
            }
        }
        System.out.println(area);
    }
}
