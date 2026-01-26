public class zigzag_level_order {
    public static void main(String[] args) {
        bst tree = new bst();
        bst.insert(tree, 34);
        bst.insert(tree, 12);
        bst.insert(tree, 56);
        bst.insert(tree, 78);
        bst.insert(tree, 3);
        bst.insert(tree, 2);
        bst.insert(tree, 6);
        bst.insert(tree, 79);
        bst.insert(tree, 69);
        bst.insert(tree, 11);
        bst.insert(tree, 46);
        bst.insert(tree, 23);

        bst.node p = tree.root;

        deque<bst.node> q = new deque<>();
        q.enqueue(p);
        while (!q.isempty()){
            int size = q.rear-q.front+1;
            while(size != 0 && !q.isempty()){
                bst.node curr = q.dequeue();
                System.out.print(curr.val+" ");
                if(curr.left != null){
                    q.enqueue(curr.left);
                }
                if(curr.right != null){
                    q.enqueue(curr.right);
                }
                size--;
            }
            size = q.rear-q.front+1;
            while(size != 0 && !q.isempty()){
                bst.node curr = q.dequeue_rear();
                System.out.print(curr.val+" ");
                if(curr.right != null){
                    q.enqueue_front(curr.right);
                }
                if(curr.left != null){
                    q.enqueue_front(curr.left);
                }
                size--;
            }
        }
    }
}
