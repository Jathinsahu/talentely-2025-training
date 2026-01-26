public class ll {
    node head;



    static class node{
        int val;
        node next;
        node(int d){
            val=d;
            next=null;
        }
    }

    public static ll insert(ll list,int data){

        node new_ll = new node(data);

        if (list.head==null){
            list.head = new_ll;
        }
        else{
            node p= list.head;
            while(p.next != null){
                p = p.next;
            }
            p.next=new_ll;
        }
        return list;
    }

    public static void print(ll list){
        node p = list.head;
        while(p != null){
            System.out.print(p.val+" -> ");
            p=p.next;
        }
        System.out.println("\b\b\b");
    }

}
