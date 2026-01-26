public class REVERSE_EVEN {
    static void even(int st,int end,int order){
        if (order ==-1){
            st = st^end;
            end = st^end;
            st = st^end;
        }
        System.out.println("st: "+st+ " end*order: "+(end*order) );
        for(st=st-st%2;(st*order)<=end-end%2;st += (order*2)){
            System.out.print(st+" ");
        }
    }

    public static void main(String[] args) {
        even(1,100,1);
        System.out.println();
        even(1,100,-1);
        int a =10;

    }
}
