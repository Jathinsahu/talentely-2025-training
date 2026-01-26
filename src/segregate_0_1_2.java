import java.util.Scanner;

public class segregate_0_1_2 {
    public static void main(String[] args) {
        ll list1 = new ll();
        ll.node tail_0 = list1.head;
        ll list2 = new ll();
        ll.node tail_1 = list2.head ;
        ll list3 = new ll();

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int val;

        for(int i=0;i<n;i++){
            val = sc.nextInt();
            if (val ==0){
                ll.insert(list1,0);
                if (list1.head.next == null) tail_0 = list1.head;
                else tail_0 = tail_0.next;
            }else if (val==1){
                ll.insert(list2,1);
                if (list2.head.next == null) tail_1 = list2.head;
                else tail_1 = tail_1.next;
            }else ll.insert(list3,2);

        }

        ll.print(list1);
        ll.print(list2);
        ll.print(list3);

        tail_0.next = list2.head;
        tail_1.next = list3.head;

        ll.print(list1);

    }

}
