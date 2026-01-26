import java.util.ArrayList;

class poly_divisible {
    boolean[] visited;
    ArrayList<Integer> res= new ArrayList<>();
    poly_divisible(int dig){
        visited=new boolean[dig+1];
        visited[0]=true;
        for(int i=1;i<=dig;i++) visited[i]=false;
        get_num(0,dig);
    }

    boolean get_num(int num,int dig){
        int n = (num == 0) ? 0 : (int) Math.log10(num) + 1;

        if(n==dig){
            res.add(num);
            return true;
        }


        for(int i=1;i<=dig;i++){
            if(!visited[i]) {
                if (((num * 10) + i) % (n+1) == 0) {
                    visited[i] = true;
                    if(get_num(((num * 10) + i), dig));
                    visited[i]=false;
                }
            }

            }
        return false;
        }


    public static void main(String[] args) {
        poly_divisible d =new poly_divisible(3);
        System.out.println(d.res);
    }

}
