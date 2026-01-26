public class rev_k_list extends k_reversal {
    public static void main(String[] args) {
        k_reversal list = new k_reversal();



        for (int i = 1; i <= 10; i++) {
            list.insert(list,i+10);
        }

        System.out.println("Original List:");
        list.print(list);

        int k = 5;
        list.reverseEveryKGroup(k);

        System.out.println("List after reversing every " + k + " elements:");
        list.print(list);
    }
}
