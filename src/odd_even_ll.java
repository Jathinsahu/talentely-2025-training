import java.util.Scanner;

public class odd_even_ll {
    public static void main(String[] args) {
        ll list1 = new ll();
        ll list2 = new ll();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val;

        for(int i=0;i<n;i++){
            val = sc.nextInt();
            if (val %2 ==0) ll.insert(list1,val);
            else ll.insert(list2,val);
        }

        ll.print(list1);
        ll.print(list2);

        ll.node p = list1.head;
        while(p.next != null){
            p=p.next;
        }
        p.next=list2.head;

        ll.print(list1);

    }

}
