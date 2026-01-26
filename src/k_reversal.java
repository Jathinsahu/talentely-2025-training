public class k_reversal extends ll {
    public void reverseEveryKGroup(int k) {
        if (head == null || k <= 1) return;

        node dummy = new node(0);
        dummy.next = head;
        node prevGroupEnd = dummy;

        while (true) {
            node kth = prevGroupEnd;
            int count = 0;
            while (count < k && kth != null) {
                kth = kth.next;
                count++;
            }
            if (kth == null) break;

            node groupStart = prevGroupEnd.next;
            node curr = groupStart.next;

            for (int i = 1; i < k; i++) {
                node next = curr.next;
                curr.next = prevGroupEnd.next;
                prevGroupEnd.next = curr;
                groupStart.next = next;
                curr = next;
            }

            prevGroupEnd = groupStart;
        }

        head = dummy.next;
    }

}
