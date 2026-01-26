public class level_order {
    public static void main(String[] args) {
        bst tree = new bst();
        bst.insert(tree, 34);
        bst.insert(tree, 12);
        bst.insert(tree, 56);
        bst.insert(tree, 3);
        bst.insert(tree, 23);
        bst.insert(tree, 46);
        bst.insert(tree, 78);
        bst.insert(tree, 2);
        bst.insert(tree, 6);
        bst.insert(tree, 69);
        bst.insert(tree, 79);
        bst.insert(tree, 11);
        bst.insert(tree, 7);
        bst.insert(tree, 8);
        bst.insert(tree, 9);

        bst.node p = tree.root;

        queue<bst.node> q = new queue<>();
        q.enqueue(p);
        while(!q.isempty()){
            bst.node curr = q.dequeue();
            System.out.print(curr.val+" ");
            if(curr.left != null){
                q.enqueue(curr.left);
            }
            if(curr.right != null){
                q.enqueue(curr.right);
            }
        }


    }
}
