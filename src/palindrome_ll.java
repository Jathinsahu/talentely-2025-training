public class palindrome_ll {
    public static void main(String[] args) {
        ll list = new ll();
        ll.insert(list, 1);
        ll.insert(list, 2);
        ll.insert(list, 3);
        ll.insert(list, 2);
        ll.insert(list, 1);
        ll.node p = list.head;
        int size = 1;
        int curr=1;
        boolean flag = true;
        ll.node tail,q;
        while(p.next != null){
            size++;
            p=p.next;
        }
        tail=p;
        p=list.head;
        if(p.val!=tail.val) {
            flag = false;
            size=0;
        }
        for(int i=0;i<size/2;i++){
            p=p.next;
            q=p;
            while(q.next != tail){
                q=q.next;
            }
            if(p.val != q.val){
                flag = false;
                break;
            }
            tail=q;
        }

        if (flag) System.out.println("Is Palindrome");
        else System.out.println("Not a Palindrome");

    }
}
